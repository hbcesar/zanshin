/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.acad.model.acad.provider;


import it.unitn.disi.acad.model.acad.AcadFactory;

import it.unitn.disi.zanshin.model.gore.GorePackage;

import it.unitn.disi.zanshin.model.gore.provider.GoalModelItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link it.unitn.disi.acad.model.acad.AcadGoalModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AcadGoalModelItemProvider
	extends GoalModelItemProvider
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
	public AcadGoalModelItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns AcadGoalModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AcadGoalModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		Object labelValue = ((EObject)object).eGet(GorePackage.Literals.GOAL_MODEL__INTERNAL_ID);
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_AcadGoalModel_type") :
			getString("_UI_AcadGoalModel_type") + " " + label;
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
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_GenDispatch()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_CallTaking()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_ResourceId()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_ResourceMob()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_ObtainMap()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_IncidentUpd()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_RegCall()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_AssignIncident()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_RouteAssist()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_ManualMap()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_DispExcept()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_MonitorRes()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__ROOT_GOAL,
				 AcadFactory.eINSTANCE.createG_UpdPosition()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__SOFTGOALS,
				 AcadFactory.eINSTANCE.createS_FastDispatch()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__SOFTGOALS,
				 AcadFactory.eINSTANCE.createS_FastAssist()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__SOFTGOALS,
				 AcadFactory.eINSTANCE.createS_FastArriv()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__SOFTGOALS,
				 AcadFactory.eINSTANCE.createS_LowCost()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__SOFTGOALS,
				 AcadFactory.eINSTANCE.createS_UserFriendly()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR1()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR2()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR3()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR4()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR5()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR6()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR7()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR8()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR9()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR10()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR11()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR12()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR13()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
				 AcadFactory.eINSTANCE.createAR14()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.GOAL_MODEL__AW_REQS,
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
