import express from 'express'

const app = express()

app.get('/',(req,res)=>{ res.status(200).json({message: 'Hola soy el microservicio 03...'})})

app.listen(0,function () {
    console.log(`Servidor escuchando en el puerto ${this.address().port}`);
})

