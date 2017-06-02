/**
 * Polynomial
 * polyAdder
 * Write.java
 */
package polyAdder;

/**
 * @class	Write
 * @author 	Chris Fedun
 * @date	Jun 1, 2017
 *
 */
public interface Write extends Read {


	/**
	 * 
	 * @see polyAdder.ReadWriteFile#openFile(java.lang.String)
	 */
	public default void openFile(  )
	{
		openFile("PolyResult.txt");
	}
}
