/*******************************************************************************
 * Student:             Adam C. Dick, BSE
 * Master's Thesis:     Validating and Updating Structural FE Models
 *                      for Dynamic Analysis
 * 
 * Industry Partner:    Industrieanlagen-Betriebsgesellschaft mbH in Ottobrunn
 * Supervisor:          Dr.-Ing. Manfred Kroiss
 * 
 * Academic Partner:    Technische Universitaet Muenchen
 * Supervisor:          Dr.-Ing. Martin Ruess
 ******************************************************************************/
package de.iabg.mesh;

import java.io.File;
import java.io.IOException;

/*******************************************************************************
 * This interface declares basic functionality for writing a file containing
 * geometric connection data, namely node connections.  In general, the user
 * should call {@link #setFirstMeshFile(java.io.File)} and
 * {@link #setLastMeshFile(java.io.File)} so that the file data can also be
 * written.  The data can then be written by calling
 * {@link #exportNodeConnections(de.iabg.mesh.NodeConnectionMatrix)}.
 * 
 * @author  Adam C. Dick, BSE
 * @version November 1, 2008
 ******************************************************************************/
public interface MeshConnectionWriter {
    
    
    
    /***************************************************************************
     * Writes the given node connections.  This method should be called after
     * {@link #setFirstMeshFile(java.io.File)} and
     * {@link #setLastMeshFile(java.io.File)} so that the file data can also be
     * written.
     * 
     * @param   connections         the {@link NodeConnectionMatrix} to be
     *                              written
     * @throws  java.io.IOException if the file could not be written
     **************************************************************************/
    public void exportNodeConnections(NodeConnectionMatrix connections)
            throws IOException;
    
    
    
    /***************************************************************************
     * Internally saves the connected degrees of freedom to be written with any
     * exported data.
     * 
     * @param   connectionDOF   the connected degrees of freedom
     **************************************************************************/
    public void setConnectionDegreesOfFreedom(String connectionDOF);
    
    
    
    /***************************************************************************
     * Internally saves the first connection identifier to be written with any
     * exported data.
     * 
     * @param   connectionIdentifier   the first connection identifier
     **************************************************************************/
    public void setConnectionIdentifier(int connectionIdentifier);
    
    
    
    /***************************************************************************
     * Internally saves the connection type to be written with any exported
     * data.
     * 
     * @param   connectionType  the connection type
     **************************************************************************/
    public void setConnectionType(String connectionType);
    
    
    
    /***************************************************************************
     * Internally saves the file data to be written with any exported data.
     * 
     * @param   firstMeshFile   the file of the {@code First Mesh}
     **************************************************************************/
    public void setFirstMeshFile(File firstMeshFile);
    
    
    
    /***************************************************************************
     * Internally saves the independent mesh of the exported data.
     * 
     * @param   independentMesh the independent mesh
     **************************************************************************/
    public void setIndependentMesh(String independentMesh);
    
    
    
    /***************************************************************************
     * Internally saves the file data to be written with any exported data.
     * 
     * @param   lastMeshFile    the file of the {@code Last Mesh}
     **************************************************************************/
    public void setLastMeshFile(File lastMeshFile);
} // eoi