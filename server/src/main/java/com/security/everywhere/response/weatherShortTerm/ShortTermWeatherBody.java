package com.security.everywhere.response.weatherShortTerm;

public class ShortTermWeatherBody {
    private ShortTermWeatherItems items;
    private String numOfRows;
    private String pageNo;
    private String totalCount;

    public ShortTermWeatherItems getItems() {
        return items;
    }

    public void setItems(ShortTermWeatherItems items) {
        this.items = items;
    }

    public String getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(String numOfRows) {
        this.numOfRows = numOfRows;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "ShortTermWeatherBody{" +
                "items=" + items +
                ", numOfRows='" + numOfRows + '\'' +
                ", pageNo='" + pageNo + '\'' +
                ", totalCount='" + totalCount + '\'' +
                '}';
    }
}
