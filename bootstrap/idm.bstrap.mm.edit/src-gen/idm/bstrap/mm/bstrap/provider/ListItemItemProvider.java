/**
 */
package idm.bstrap.mm.bstrap.provider;

import idm.bstrap.mm.bstrap.BstrapFactory;
import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.ListItem;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link idm.bstrap.mm.bstrap.ListItem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ListItemItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemItemProvider(AdapterFactory adapterFactory) {
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

			addActivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ListItem_active_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ListItem_active_feature",
								"_UI_ListItem_type"),
						BstrapPackage.Literals.LIST_ITEM__ACTIVE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS);
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
	 * This returns ListItem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ListItem"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ListItem listItem = (ListItem) object;
		return getString("_UI_ListItem_type") + " " + listItem.isActive();
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

		switch (notification.getFeatureID(ListItem.class)) {
		case BstrapPackage.LIST_ITEM__ACTIVE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case BstrapPackage.LIST_ITEM__LISTITEMELEMENTS:
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

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createParagraphe()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createText()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createCode()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createImage()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createOrderList()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createUnOrderedList()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createStrong()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createItalic()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createBlockQuote()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createCodeBlock()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.LIST_ITEM__LISTITEMELEMENTS,
				BstrapFactory.eINSTANCE.createSpan()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BstrapEditPlugin.INSTANCE;
	}

}
