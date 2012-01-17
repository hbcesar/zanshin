/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.provider;


import it.unitn.disi.zanshin.model.eca.EcaFactory;

import it.unitn.disi.zanshin.model.eca.provider.ZanshinEditPlugin;

import it.unitn.disi.zanshin.model.gore.GoreFactory;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.RefinementType;
import it.unitn.disi.zanshin.model.gore.Requirement;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eeat.model.LTL.provider.OclAnyItemProvider;

/**
 * This is the item provider adapter for a {@link it.unitn.disi.zanshin.model.gore.Requirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementItemProvider
	extends OclAnyItemProvider
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
	public RequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRefinementTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Refinement Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinementTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Requirement_refinementType_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Requirement_refinementType_feature", "_UI_Requirement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GorePackage.Literals.REQUIREMENT__REFINEMENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GorePackage.Literals.REQUIREMENT__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Requirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Requirement")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RefinementType labelValue = ((Requirement)object).getRefinementType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Requirement_type") : //$NON-NLS-1$
			getString("_UI_Requirement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Requirement.class)) {
			case GorePackage.REQUIREMENT__REFINEMENT_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GorePackage.REQUIREMENT__CHILDREN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 GoreFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 GoreFactory.eINSTANCE.createDefinableRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 GoreFactory.eINSTANCE.createSoftgoal()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 GoreFactory.eINSTANCE.createPerformativeRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 GoreFactory.eINSTANCE.createQualityConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 GoreFactory.eINSTANCE.createAwReq()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 GoreFactory.eINSTANCE.createDomainAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 GoreFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 GoreFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(GorePackage.Literals.REQUIREMENT__CHILDREN,
				 EcaFactory.eINSTANCE.createEcaAwReq()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ZanshinEditPlugin.INSTANCE;
	}

}
