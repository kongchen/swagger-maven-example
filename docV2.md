#API Document


## BasePath: http://host:port

## Api Version: v2

## Resources
### 1. /v2/car
#### Overview
Operations about cars

#### 1.1 `/v2/car.{format}/{carId}`
##### 1.1.1 getCarById
**GET** `/v2/car.{format}/{carId}`

Find car by ID
To get car info by car's Id

###### URL
    http://host:port/v2/car.{format}/{carId}
###### Parameters
- path

    <table border="1">
        <tr>
            <th>Parameter</th>
            <th>Required</th>
            <th>Description</th>
            <th>Data Type</th>
        </tr>
        <tr>
            <th>carId</th>
            <td>true</td>
            <td>ID of car that needs to be fetched</td>
            <td>string</td>
        </tr>
    </table>

###### Response
[Car](#Car)


###### Errors
<table border="1">
    <tr>
        <th>Status Code</th>
        <th>Reason</th>
    </tr>
        <tr>
            <td>400</td>
            <td>Invalid ID supplied</td>
        </tr>
        <tr>
            <td>404</td>
            <td>Car not found</td>
        </tr>
</table>


- - -

## Data Types


## <a name="Car">Car</a>

<table border="1">
    <tr>
        <th>type</th>
        <th>required</th>
        <th>access</th>
        <th>description</th>
        <th>notes</th>
    </tr>
        <tr>
            <th>id</th>
            <td>int</td>
            <td>optional</td>
            <td>-</td>
            <td>car's id</td>
        </tr>
        <tr>
            <th>price</th>
            <td>float</td>
            <td>optional</td>
            <td>-</td>
            <td>The price of the car</td>
        </tr>
        <tr>
            <th>engine</th>
            <td>string</td>
            <td>optional</td>
            <td>-</td>
            <td>The engine parameter of the car</td>
        </tr>
        <tr>
            <th>mt</th>
            <td>boolean</td>
            <td>optional</td>
            <td>-</td>
            <td>Indicate the car is MT or AT</td>
        </tr>
        <tr>
            <th>brand</th>
            <td>string</td>
            <td>optional</td>
            <td>-</td>
            <td>The brand of the car</td>
        </tr>
        <tr>
            <th>notes</th>
            <td>string</td>
            <td>optional</td>
            <td>-</td>
            <td>Any other comments for the car</td>
        </tr>
</table>


