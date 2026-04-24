const User = require('../models/UserModel');

exports.createUser = (req, res) => {
    const { name, email } = req.body;
    const user = new User(name, email);

    res.json(user);
};