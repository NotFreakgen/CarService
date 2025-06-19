import * as mysql from "mysql2"

const pool = mysql.createPool({
    host: '172.18.0.2',
    user: 'root',
    password: 'root',
    database: 'cars',
    port: '3306'
}).promise()

export async function getCars() {
    const result = await pool.query("SELECT * FROM cars")
    const rows = result[0]
    return rows
}
export async function buyCar(id, count){
    const result = await pool.query(
        `update cars
        set Count = (?)
        where idCars = (?)
        `, [count, id])
    const rows = result[0]
    return rows
}

//const result = await buyCar(1, 14)
//const cars = await getCars()
//cars.map((car) => console.log(car.Count))
//console.log(Object.getOwnPropertyNames(cars[0]))
//console.log(cars[0].Mark)