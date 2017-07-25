package com.yibo.saiku.database.dao;

import com.yibo.saiku.database.dto.User;

/**
 * Created by bugg on 01/05/14.
 */
interface UserDAO {
  User getUser(String login);

}
