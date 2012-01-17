/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.acad.model.acad.provider;


import it.unitn.disi.acad.model.acad.AcadFactory;
import it.unitn.disi.acad.model.acad.T_CloseIncident;

import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.RefinementType;

import it.unitn.disi.zanshin.model.gore.provider.TaskItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link it.unitn.disi.acad.model.acad.T_CloseIncident} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class T_CloseIncidentItemProvider
	extends TaskItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_CloseIncidentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns T_CloseIncident.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/T_CloseIncident"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		RefinementType labelValue = ((T_CloseIncident)object).getRefinementType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_T_CloseIncident_type") :
			getString("_UI_T_CloseIncident_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_GenDispatch()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_CallTaking()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createD_DataUpd()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_ResourceId()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_ResourceMob()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_ObtainMap()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_IncidentUpd()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createD_MaxCalls()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_RegCall()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_ConfirmCall()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_AssignIncident()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_SearchDuplic()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_CreateOrAssign()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_InputInfo()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_DetectLoc()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_SpecConfig()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_ConfIncident()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_DetBestAmb()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_InformStat()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_RouteAssist()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createD_DriverKnows()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_AcadAssists()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_StaffAssists()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_Feedback()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createD_GazetUpd()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_ManualMap()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_CheckGazet()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_CheckPaper()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_DispExcept()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_MonitorRes()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createG_UpdPosition()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createD_MDTPos()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_RadioPos()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createD_MDTUse()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_MonitorStatus()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_DispStatus()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_DispDepArriv()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_ReplAmb()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_Except()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_ExceptQueue()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createT_CloseIncident()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createS_FastDispatch()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createQ_Dispatch()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createS_FastAssist()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createQ_IncidResolv()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createS_FastArriv()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createQ_AmbArriv()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createS_LowCost()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createQ_MaxCost()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createS_UserFriendly()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createQ_MaxTimeMsg()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR1()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR2()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR3()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR4()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR5()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR6()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR7()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR8()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR9()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR10()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR11()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR12()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR13()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR14()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 AcadFactory.eINSTANCE.createAR15()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return AcadEditPlugin.INSTANCE;
	}

}
