const sql = require ("mssql");

const http = require('http');
const port = process.env.PORT || 5000;
const express = require('express');
const app = express();
const server = http.createServer(app);

var dbConfig = {
    server: 'localhost',
    database: 'PeruMotor',
    user: 'sa',
    password: 'myPassw0rd',
    port: 1433,
    driver: 'tedious',
    stream: false
}; 

/*function getList(){
    var conn = new sql.ConnectionPool(dbConfig);
    conn.connect(function (err) {
        if (err) throw err;
        var req = new sql.Request(conn);
        req.query("SELECT * FROM usuarios", function (err, recordset) {
            if (err) throw err;
            else
                console.log(recordset);
            
        })
    })
}

getList();*/

sql.connect(dbConfig).then(pool =>{
    if(pool.connecting){
        console.log('Conectando a la base de datos');
    }
    if(pool.connect){
        server.listen(port, () =>{
            console.log('Corriendo en el puerto', port);

        })
    }
    return pool;
}).catch(function(err){
    console.log('error al conectar con la base de datos');
    console.log(err);
})



// function getEmp() {
//     const conn = new sql.ConnectionPool(dbConfig);
//     const req = new sql.Request(conn);

//     conn.connect(function (err) {
//         if (err) {
//             console.log(err);
//             console.log('error al conectar');
//         }
//         else {
//             console.log('Conexión exitosa');
//         }
//         conn.close();
//     });
// }

// getEmp();