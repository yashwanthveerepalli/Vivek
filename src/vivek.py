#Importing necessary libraries

import pandas as pd # Pandas for working with dataframes
import os # OS for file management

#Getting current working directory

os.getcwd()

#Listing files in the current working directory

os.listdir(os.getcwd())

#Reading CSV files into Pandas dataframes

df_dep = pd.read_csv('departments.csv')
df_head_count = pd.read_csv('head_counts.csv')
df_loc = pd.read_csv('locations.csv')

#Merging dataframes based on common columns

df = pd.merge(df_head_count, df_loc, left_on='location', right_on='level8', how='inner')

#Selecting required columns from merged dataframe

df = df[['location','department','head_count','level5']]

#Displaying resulting dataframe

display(df)

#Merging dataframes based on common columns

df1 = pd.merge(df, df_dep, left_on='department', right_on='bottom_level', how='inner')

#Displaying resulting dataframe

display(df1)

#Grouping data and performing calculations

df_agg = df1.groupby(['level5_x', 'level5_y'])['head_count'].sum().reset_index()

#Displaying resulting dataframe

display(df_agg)

#Renaming column names in the dataframe

df_agg = df_agg.rename(columns={'level5_x': 'location', 'level5_y': 'department'})

#Displaying resulting dataframe

display(df_agg)

#Saving dataframe to CSV file

df_agg.to_csv('output_vivek.csv', index=False)
