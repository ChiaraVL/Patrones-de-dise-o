package model;

public interface DatabaseFacade {
	public String create(Object ent);

	public String read(Object ent);

	public String update(Object ent);

	public String delete(Object ent);

	public String search(Object ent);
}
