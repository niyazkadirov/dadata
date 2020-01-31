# Dadata Client

**1. Setting**

 Add to application.properties
 
```
app.token=your_api_token
app.url=https://suggestions.dadata.ru/suggestions/api/4_1/rs/suggest/address
```

**2. Request**

  You can send a GET request to the address
  
  ```
  /api/{location}/{location_param}
  
```
  
  where, **location** - location for which you want to get parameters, **location_param** - parameters you want to get  
  
  **3. Example**
  
   
  ```
   /api/казань/regionkladrid
  ```
  the answer for this request will be
  
  > 1600000000000
  
  **4. Parameters**
  
  ```
  regionKladrId - region KLADR code
  
  region - Region
  
  regionFiasId - area FIAS code in the region  
  ```
  
  if a non-existent parameter is entered, then all parameters for this region will be returned in the form of JSON
  
