# !/usr/bin/env python3
import psycopg2
import csv



if __name__ =='__main__':
    conn = psycopg2.connect(host="localhost", port="5432", user="postgres", password="postgres", database="postgresdb")
    cur = conn.cursor()

    insert_into_drivers_table = """INSERT INTO drivers(driver_id, first_name, last_name, email, password) VALUES(%s,%s,%s,%s,%s);"""
    cur.execute(insert_into_drivers_table,
                ['dfd', 'Charles', 'Jones', 'cjones@gmail.com', '1!ZionTF'])
    conn.commit()

    print("THE DRIVER HAS BEEN INSERTED.")