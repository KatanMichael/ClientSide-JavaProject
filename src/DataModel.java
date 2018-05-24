public class DataModel<T> implements java.io.Serializable
{
	private Long id;
	private T content;

	public DataModel(Long id, T content)
	{
		this.id = id;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public T getContent() {
		return content;
	}

	@Override
	public String toString()
	{
		return "DataModel{" +
				"id=" + id +
				", content=" + content +
				'}';
	}
}
