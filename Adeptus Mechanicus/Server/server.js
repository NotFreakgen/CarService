import express from 'express'
import { getCars, buyCar } from './database.js'

const app = express()
const hostname = "0.0.0.0"

app.use(express.json())

app.get("/api/GetCars", async (req, res) => {
    const cars = await getCars()
    res.send(cars)
})
app.post("/api/BuyCar", async (req, res) => {
    const {id, Count} = req.body
    const car = await buyCar(id, Count)
    res.status(201).send(car)
})

app.use((err, req, res, next) => {
  console.error(err.stack)
  res.status(500).send(err)
})
app.listen(8080, hostname, () => {
  console.log(`Server is running on ${hostname}:8080`)
})
app.get("/HomePage", async (req, res) => {
    const cars = await getCars()
    res.send()
})