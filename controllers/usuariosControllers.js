const sqlConection = require('../index');

module.exports = {
    show: (req, res, next) => {
        sqlConection.query('SELECT * FROM usuarios', (err, rows) => {
            if(!err) {
                res.json(rows);
            }else{
                console.log('ERROR ->' + err);
            }
        });
    }
}