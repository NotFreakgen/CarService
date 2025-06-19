import React, {useEffect, useState} from "react"

function CarService(){
    const [cars, setCars] = useState([{}])

    useEffect(() => {
          fetch("/api/GetCars")
          .then(response => response.json())
          .then(data => setCars(data))
          .catch(error => console.error(error))
      }, [])
    
    function handleInputChange(event){

    }
    function handleInput(index)
    {
        const cars2 = [...cars]
        cars2[index.index - 1].Count -= 1 
        setCars(cars2)
    }
    function buyCar(index, count){
        const newData = {
            id: index.index,
            Count: count.availableCount - 1
        }
        fetch("/api/BuyCar", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newData)
        })
        .then((res) => res.json())
        .catch(error => {
            console.log(error)
        })
        
    }
    function printCar(mark, price, availableCount, index){
        return (
            <li key={index}>
                <div className="carColumn">

                    <span className="text">
                    {mark}
                    </span>

                    <span className="text">
                        Стоимость - {price}
                    </span>

                </div>
                <div className="carColumn">
                    <span className="text">
                    Количество в наличии - {availableCount}
                </span>
                <button
                    className="buy-button"
                    onClick={() => {
                        buyCar({index} , {availableCount})
                        handleInput({index})
                        }}>
                    Купить
                </button>
                </div>
            </li>
            )
    }
    return (
    
    <div className="CarsList">
        <h1>Автосалон</h1>

        <ol>
            {
            cars.map((car) =>
                printCar(car.Mark, car.Price, car.Count, car.idCars)
            )}
        </ol>

    </div>
    )
}
export default CarService