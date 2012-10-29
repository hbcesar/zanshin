package it.unitn.disi.zanshin.remote;

import java.security.Permission;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ZanshinSecurityManager extends SecurityManager {

	/** @see java.lang.SecurityManager#checkPermission(java.security.Permission) */
	@Override
	public void checkPermission(Permission perm) {}

	/** @see java.lang.SecurityManager#checkPermission(java.security.Permission, java.lang.Object) */
	@Override
	public void checkPermission(Permission perm, Object context) {}

}
