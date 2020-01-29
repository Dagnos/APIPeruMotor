const express = require('express');
const router = express.Router();
const usuariosControllers = require('../controllers/usuariosControllers');

router.get('/', usuariosControllers.show);

module.exports = router;