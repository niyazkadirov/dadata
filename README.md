# Dadata Client

**1. Настройка**

 Добавить в application.properties
 
 > app.token=your_api_token
 
 > app.url=https://suggestions.dadata.ru/suggestions/api/4_1/rs/suggest/address

**2. Запросы**

  Вы можете отправить GET запрос на адрес
  
  > /api/{location}/{location_param}
  
  где, **location** - локация, для которого вы хотите получить параметры, **location_param** - параметры, которые вы хотите получить  
  
  **3. Пример**
  
  > /api/казань/regionkladrid
  
  ответом для данного запроса будет
  
  > 1600000000000
  
  **4. Параметры**
  
  > regionKladrId - Код КЛАДР региона
  
  > region - Регион
  
  > regionFiasId - 	Код ФИАС района в регионе 
  
