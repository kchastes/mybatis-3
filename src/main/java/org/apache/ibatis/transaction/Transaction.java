/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 包装数据库连接。处理连接生命周期，包括：它的创建、准备、提交/回滚和关闭。
 * @author Clinton Begin
 */
public interface Transaction {

  /**
   * 检索内部数据库连接
   * @return DataBase connection
   * @throws SQLException
   *           the SQL exception
   */
  Connection getConnection() throws SQLException;

  /**
   * Commit inner database connection.
   * @throws SQLException
   *           the SQL exception
   */
  void commit() throws SQLException;

  /**
   * 回滚内部数据库连接。
   * @throws SQLException
   *           the SQL exception
   */
  void rollback() throws SQLException;

  /**
   * 关闭内部数据库连接
   * @throws SQLException
   *           the SQL exception
   */
  void close() throws SQLException;

  /**
   * 如果设置，则获取事务超时
   *
   * @return the timeout
   * @throws SQLException
   *           the SQL exception
   */
  Integer getTimeout() throws SQLException;

}
