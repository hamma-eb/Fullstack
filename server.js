const http = require("http")
const path = require("path")
const express = require("express")
const port = process.env.PORT || 4000
const app = express()
const dpd = path.join(__dirname,"./public")
app.use (express.static(dpd))
const server = http.createServer(app)
server.listen(port,()=>{
    console.log(`server is up on port ${port}`)
})

const socketio = require("socket.io");
const io = socketio(server);

io.on("connection",(client)=> {
    console.log("new connect");

    client.on("disconnect",()=>{
        console.log("new disconnect");
    })
})
