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
