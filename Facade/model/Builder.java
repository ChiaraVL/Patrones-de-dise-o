package model;

public interface Builder {
    public void facade(int op);
    public String getCreate(Object ent);
	public String getRead(Object ent);
	public String getUpdate(Object ent);
    public String getDelete(Object ent);
    public String getSearch(Object ent);
}
