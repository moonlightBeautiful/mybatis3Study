package com.ims.c06annotate.mappers;

import com.ims.c06annotate.model.Cat;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;


public class CatDynaSqlProvider {

    /**
     * insert动态sql
     *
     * @param cat
     * @return
     */
    public String insertCat(final Cat cat) {
        return new SQL() {
            {
                INSERT_INTO("t_cat");
                if (cat.getName() != null) {
                    VALUES("name", "#{name}");
                }
                if (cat.getAge() != null) {
                    VALUES("age", "#{age}");
                }
            }
        }.toString();
    }

    /**
     * update动态sql
     *
     * @param cat
     * @return
     */
    public String updateCat(final Cat cat) {
        return new SQL() {
            {
                UPDATE("t_cat");
                if (cat.getName() != null) {
                    SET("name=#{name}");
                }
                if (cat.getAge() != null) {
                    SET("age=#{age}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }

    /**
     * delete动态sql
     *
     * @return
     */
    public String deleteCat() {
        return new SQL() {
            {
                DELETE_FROM("t_cat");
                WHERE("id=#{id}");
            }
        }.toString();
    }

    /**
     * select动态sql
     *
     * @return
     */
    public String getCatById() {
        return new SQL() {
            {
                SELECT("*");
                FROM("t_cat");
                WHERE("id=#{id}");
            }
        }.toString();
    }

    /**
     * select动态sql
     *
     * @return
     */
    public String findCats(final Map<String, Object> map) {
        return new SQL() {
            {
                SELECT("*");
                FROM("t_cat");
                StringBuffer sb = new StringBuffer();
                if (map.get("name") != null) {
                    sb.append(" and name like '%" + map.get("name") + "%'");
                }
                if (map.get("age") != null) {
                    sb.append(" and age=" + map.get("age"));
                }
                if (!sb.toString().equals("")) {
                    WHERE(sb.toString().replaceFirst("and", ""));
                }
            }
        }.toString();
    }
}

