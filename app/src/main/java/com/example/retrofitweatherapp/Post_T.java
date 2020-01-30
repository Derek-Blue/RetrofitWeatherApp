package com.example.retrofitweatherapp;

import java.util.List;

public class Post_T {


    /**
     * success : true
     * result : {"resource_id":"F-D0047-091","fields":[{"id":"contentDescription","type":"String"},{"id":"datasetDescription","type":"String"},{"id":"locationsName","type":"String"},{"id":"dataid","type":"String"},{"id":"locationName","type":"String"},{"id":"geocode","type":"Double"},{"id":"lat","type":"Double"},{"id":"lon","type":"Double"},{"id":"elementName","type":"String"},{"id":"description","type":"String"},{"id":"startTime","type":"Timestamp"},{"id":"endTime","type":"Timestamp"},{"id":"dataTime","type":"Timestamp"},{"id":"value","type":"String"},{"id":"measures","type":"String"}]}
     * records : {"locations":[{"datasetDescription":"臺灣各縣市鄉鎮未來1週逐12小時天氣預報","locationsName":"台灣","dataid":"D0047-091","location":[{"locationName":"高雄市","geocode":"64","lat":"22.623511","lon":"120.304085","weatherElement":[{"elementName":"PoP12h","description":"12小時降雨機率","time":[{"startTime":"2020-01-30 12:00:00","endTime":"2020-01-30 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-30 18:00:00","endTime":"2020-01-31 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-31 06:00:00","endTime":"2020-01-31 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-31 18:00:00","endTime":"2020-02-01 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-01 06:00:00","endTime":"2020-02-01 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-01 18:00:00","endTime":"2020-02-02 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-02 06:00:00","endTime":"2020-02-02 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-02 18:00:00","endTime":"2020-02-03 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-03 06:00:00","endTime":"2020-02-03 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-03 18:00:00","endTime":"2020-02-04 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-04 06:00:00","endTime":"2020-02-04 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-04 18:00:00","endTime":"2020-02-05 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-05 06:00:00","endTime":"2020-02-05 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-05 18:00:00","endTime":"2020-02-06 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]}]},{"elementName":"T","description":"平均溫度","time":[{"startTime":"2020-01-30 12:00:00","endTime":"2020-01-30 18:00:00","elementValue":[{"value":"20","measures":"攝氏度"}]},{"startTime":"2020-01-30 18:00:00","endTime":"2020-01-31 06:00:00","elementValue":[{"value":"14","measures":"攝氏度"}]},{"startTime":"2020-01-31 06:00:00","endTime":"2020-01-31 18:00:00","elementValue":[{"value":"16","measures":"攝氏度"}]},{"startTime":"2020-01-31 18:00:00","endTime":"2020-02-01 06:00:00","elementValue":[{"value":"15","measures":"攝氏度"}]},{"startTime":"2020-02-01 06:00:00","endTime":"2020-02-01 18:00:00","elementValue":[{"value":"18","measures":"攝氏度"}]},{"startTime":"2020-02-01 18:00:00","endTime":"2020-02-02 06:00:00","elementValue":[{"value":"17","measures":"攝氏度"}]},{"startTime":"2020-02-02 06:00:00","endTime":"2020-02-02 18:00:00","elementValue":[{"value":"20","measures":"攝氏度"}]},{"startTime":"2020-02-02 18:00:00","endTime":"2020-02-03 06:00:00","elementValue":[{"value":"18","measures":"攝氏度"}]},{"startTime":"2020-02-03 06:00:00","endTime":"2020-02-03 18:00:00","elementValue":[{"value":"20","measures":"攝氏度"}]},{"startTime":"2020-02-03 18:00:00","endTime":"2020-02-04 06:00:00","elementValue":[{"value":"18","measures":"攝氏度"}]},{"startTime":"2020-02-04 06:00:00","endTime":"2020-02-04 18:00:00","elementValue":[{"value":"21","measures":"攝氏度"}]},{"startTime":"2020-02-04 18:00:00","endTime":"2020-02-05 06:00:00","elementValue":[{"value":"19","measures":"攝氏度"}]},{"startTime":"2020-02-05 06:00:00","endTime":"2020-02-05 18:00:00","elementValue":[{"value":"21","measures":"攝氏度"}]},{"startTime":"2020-02-05 18:00:00","endTime":"2020-02-06 06:00:00","elementValue":[{"value":"19","measures":"攝氏度"}]}]}]}]}]}
     */

    private String success;
    private ResultBean result;
    private RecordsBean records;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public RecordsBean getRecords() {
        return records;
    }

    public void setRecords(RecordsBean records) {
        this.records = records;
    }

    public static class ResultBean {
        /**
         * resource_id : F-D0047-091
         * fields : [{"id":"contentDescription","type":"String"},{"id":"datasetDescription","type":"String"},{"id":"locationsName","type":"String"},{"id":"dataid","type":"String"},{"id":"locationName","type":"String"},{"id":"geocode","type":"Double"},{"id":"lat","type":"Double"},{"id":"lon","type":"Double"},{"id":"elementName","type":"String"},{"id":"description","type":"String"},{"id":"startTime","type":"Timestamp"},{"id":"endTime","type":"Timestamp"},{"id":"dataTime","type":"Timestamp"},{"id":"value","type":"String"},{"id":"measures","type":"String"}]
         */

        private String resource_id;
        private List<FieldsBean> fields;

        public String getResource_id() {
            return resource_id;
        }

        public void setResource_id(String resource_id) {
            this.resource_id = resource_id;
        }

        public List<FieldsBean> getFields() {
            return fields;
        }

        public void setFields(List<FieldsBean> fields) {
            this.fields = fields;
        }

        public static class FieldsBean {
            /**
             * id : contentDescription
             * type : String
             */

            private String id;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }

    public static class RecordsBean {
        private List<LocationsBean> locations;

        public List<LocationsBean> getLocations() {
            return locations;
        }

        public void setLocations(List<LocationsBean> locations) {
            this.locations = locations;
        }

        public static class LocationsBean {
            /**
             * datasetDescription : 臺灣各縣市鄉鎮未來1週逐12小時天氣預報
             * locationsName : 台灣
             * dataid : D0047-091
             * location : [{"locationName":"高雄市","geocode":"64","lat":"22.623511","lon":"120.304085","weatherElement":[{"elementName":"PoP12h","description":"12小時降雨機率","time":[{"startTime":"2020-01-30 12:00:00","endTime":"2020-01-30 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-30 18:00:00","endTime":"2020-01-31 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-31 06:00:00","endTime":"2020-01-31 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-31 18:00:00","endTime":"2020-02-01 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-01 06:00:00","endTime":"2020-02-01 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-01 18:00:00","endTime":"2020-02-02 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-02 06:00:00","endTime":"2020-02-02 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-02 18:00:00","endTime":"2020-02-03 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-03 06:00:00","endTime":"2020-02-03 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-03 18:00:00","endTime":"2020-02-04 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-04 06:00:00","endTime":"2020-02-04 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-04 18:00:00","endTime":"2020-02-05 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-05 06:00:00","endTime":"2020-02-05 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-05 18:00:00","endTime":"2020-02-06 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]}]},{"elementName":"T","description":"平均溫度","time":[{"startTime":"2020-01-30 12:00:00","endTime":"2020-01-30 18:00:00","elementValue":[{"value":"20","measures":"攝氏度"}]},{"startTime":"2020-01-30 18:00:00","endTime":"2020-01-31 06:00:00","elementValue":[{"value":"14","measures":"攝氏度"}]},{"startTime":"2020-01-31 06:00:00","endTime":"2020-01-31 18:00:00","elementValue":[{"value":"16","measures":"攝氏度"}]},{"startTime":"2020-01-31 18:00:00","endTime":"2020-02-01 06:00:00","elementValue":[{"value":"15","measures":"攝氏度"}]},{"startTime":"2020-02-01 06:00:00","endTime":"2020-02-01 18:00:00","elementValue":[{"value":"18","measures":"攝氏度"}]},{"startTime":"2020-02-01 18:00:00","endTime":"2020-02-02 06:00:00","elementValue":[{"value":"17","measures":"攝氏度"}]},{"startTime":"2020-02-02 06:00:00","endTime":"2020-02-02 18:00:00","elementValue":[{"value":"20","measures":"攝氏度"}]},{"startTime":"2020-02-02 18:00:00","endTime":"2020-02-03 06:00:00","elementValue":[{"value":"18","measures":"攝氏度"}]},{"startTime":"2020-02-03 06:00:00","endTime":"2020-02-03 18:00:00","elementValue":[{"value":"20","measures":"攝氏度"}]},{"startTime":"2020-02-03 18:00:00","endTime":"2020-02-04 06:00:00","elementValue":[{"value":"18","measures":"攝氏度"}]},{"startTime":"2020-02-04 06:00:00","endTime":"2020-02-04 18:00:00","elementValue":[{"value":"21","measures":"攝氏度"}]},{"startTime":"2020-02-04 18:00:00","endTime":"2020-02-05 06:00:00","elementValue":[{"value":"19","measures":"攝氏度"}]},{"startTime":"2020-02-05 06:00:00","endTime":"2020-02-05 18:00:00","elementValue":[{"value":"21","measures":"攝氏度"}]},{"startTime":"2020-02-05 18:00:00","endTime":"2020-02-06 06:00:00","elementValue":[{"value":"19","measures":"攝氏度"}]}]}]}]
             */

            private String datasetDescription;
            private String locationsName;
            private String dataid;
            private List<LocationBean> location;

            public String getDatasetDescription() {
                return datasetDescription;
            }

            public void setDatasetDescription(String datasetDescription) {
                this.datasetDescription = datasetDescription;
            }

            public String getLocationsName() {
                return locationsName;
            }

            public void setLocationsName(String locationsName) {
                this.locationsName = locationsName;
            }

            public String getDataid() {
                return dataid;
            }

            public void setDataid(String dataid) {
                this.dataid = dataid;
            }

            public List<LocationBean> getLocation() {
                return location;
            }

            public void setLocation(List<LocationBean> location) {
                this.location = location;
            }

            public static class LocationBean {
                /**
                 * locationName : 高雄市
                 * geocode : 64
                 * lat : 22.623511
                 * lon : 120.304085
                 * weatherElement : [{"elementName":"PoP12h","description":"12小時降雨機率","time":[{"startTime":"2020-01-30 12:00:00","endTime":"2020-01-30 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-30 18:00:00","endTime":"2020-01-31 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-31 06:00:00","endTime":"2020-01-31 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-31 18:00:00","endTime":"2020-02-01 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-01 06:00:00","endTime":"2020-02-01 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-01 18:00:00","endTime":"2020-02-02 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-02 06:00:00","endTime":"2020-02-02 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-02 18:00:00","endTime":"2020-02-03 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-03 06:00:00","endTime":"2020-02-03 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-03 18:00:00","endTime":"2020-02-04 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-04 06:00:00","endTime":"2020-02-04 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-04 18:00:00","endTime":"2020-02-05 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-05 06:00:00","endTime":"2020-02-05 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-05 18:00:00","endTime":"2020-02-06 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]}]},{"elementName":"T","description":"平均溫度","time":[{"startTime":"2020-01-30 12:00:00","endTime":"2020-01-30 18:00:00","elementValue":[{"value":"20","measures":"攝氏度"}]},{"startTime":"2020-01-30 18:00:00","endTime":"2020-01-31 06:00:00","elementValue":[{"value":"14","measures":"攝氏度"}]},{"startTime":"2020-01-31 06:00:00","endTime":"2020-01-31 18:00:00","elementValue":[{"value":"16","measures":"攝氏度"}]},{"startTime":"2020-01-31 18:00:00","endTime":"2020-02-01 06:00:00","elementValue":[{"value":"15","measures":"攝氏度"}]},{"startTime":"2020-02-01 06:00:00","endTime":"2020-02-01 18:00:00","elementValue":[{"value":"18","measures":"攝氏度"}]},{"startTime":"2020-02-01 18:00:00","endTime":"2020-02-02 06:00:00","elementValue":[{"value":"17","measures":"攝氏度"}]},{"startTime":"2020-02-02 06:00:00","endTime":"2020-02-02 18:00:00","elementValue":[{"value":"20","measures":"攝氏度"}]},{"startTime":"2020-02-02 18:00:00","endTime":"2020-02-03 06:00:00","elementValue":[{"value":"18","measures":"攝氏度"}]},{"startTime":"2020-02-03 06:00:00","endTime":"2020-02-03 18:00:00","elementValue":[{"value":"20","measures":"攝氏度"}]},{"startTime":"2020-02-03 18:00:00","endTime":"2020-02-04 06:00:00","elementValue":[{"value":"18","measures":"攝氏度"}]},{"startTime":"2020-02-04 06:00:00","endTime":"2020-02-04 18:00:00","elementValue":[{"value":"21","measures":"攝氏度"}]},{"startTime":"2020-02-04 18:00:00","endTime":"2020-02-05 06:00:00","elementValue":[{"value":"19","measures":"攝氏度"}]},{"startTime":"2020-02-05 06:00:00","endTime":"2020-02-05 18:00:00","elementValue":[{"value":"21","measures":"攝氏度"}]},{"startTime":"2020-02-05 18:00:00","endTime":"2020-02-06 06:00:00","elementValue":[{"value":"19","measures":"攝氏度"}]}]}]
                 */

                private String locationName;
                private String geocode;
                private String lat;
                private String lon;
                private List<WeatherElementBean> weatherElement;

                public String getLocationName() {
                    return locationName;
                }

                public void setLocationName(String locationName) {
                    this.locationName = locationName;
                }

                public String getGeocode() {
                    return geocode;
                }

                public void setGeocode(String geocode) {
                    this.geocode = geocode;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLon() {
                    return lon;
                }

                public void setLon(String lon) {
                    this.lon = lon;
                }

                public List<WeatherElementBean> getWeatherElement() {
                    return weatherElement;
                }

                public void setWeatherElement(List<WeatherElementBean> weatherElement) {
                    this.weatherElement = weatherElement;
                }

                public static class WeatherElementBean {
                    /**
                     * elementName : PoP12h
                     * description : 12小時降雨機率
                     * time : [{"startTime":"2020-01-30 12:00:00","endTime":"2020-01-30 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-30 18:00:00","endTime":"2020-01-31 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-31 06:00:00","endTime":"2020-01-31 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-01-31 18:00:00","endTime":"2020-02-01 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-01 06:00:00","endTime":"2020-02-01 18:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-01 18:00:00","endTime":"2020-02-02 06:00:00","elementValue":[{"value":"0","measures":"百分比"}]},{"startTime":"2020-02-02 06:00:00","endTime":"2020-02-02 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-02 18:00:00","endTime":"2020-02-03 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-03 06:00:00","endTime":"2020-02-03 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-03 18:00:00","endTime":"2020-02-04 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-04 06:00:00","endTime":"2020-02-04 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-04 18:00:00","endTime":"2020-02-05 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-05 06:00:00","endTime":"2020-02-05 18:00:00","elementValue":[{"value":" ","measures":"百分比"}]},{"startTime":"2020-02-05 18:00:00","endTime":"2020-02-06 06:00:00","elementValue":[{"value":" ","measures":"百分比"}]}]
                     */

                    private String elementName;
                    private String description;
                    private List<TimeBean> time;

                    public String getElementName() {
                        return elementName;
                    }

                    public void setElementName(String elementName) {
                        this.elementName = elementName;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public List<TimeBean> getTime() {
                        return time;
                    }

                    public void setTime(List<TimeBean> time) {
                        this.time = time;
                    }

                    public static class TimeBean {
                        /**
                         * startTime : 2020-01-30 12:00:00
                         * endTime : 2020-01-30 18:00:00
                         * elementValue : [{"value":"0","measures":"百分比"}]
                         */

                        private String startTime;
                        private String endTime;
                        private List<ElementValueBean> elementValue;

                        public String getStartTime() {
                            return startTime;
                        }

                        public void setStartTime(String startTime) {
                            this.startTime = startTime;
                        }

                        public String getEndTime() {
                            return endTime;
                        }

                        public void setEndTime(String endTime) {
                            this.endTime = endTime;
                        }

                        public List<ElementValueBean> getElementValue() {
                            return elementValue;
                        }

                        public void setElementValue(List<ElementValueBean> elementValue) {
                            this.elementValue = elementValue;
                        }

                        public static class ElementValueBean {
                            /**
                             * value : 0
                             * measures : 百分比
                             */

                            private String value;
                            private String measures;

                            public String getValue() {
                                return value;
                            }

                            public void setValue(String value) {
                                this.value = value;
                            }

                            public String getMeasures() {
                                return measures;
                            }

                            public void setMeasures(String measures) {
                                this.measures = measures;
                            }
                        }
                    }
                }
            }
        }
    }
}
