/**
 */
package idm.bstrap.mm.bstrap.provider;

import idm.bstrap.mm.bstrap.BstrapFactory;
import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.Color;
import idm.bstrap.mm.bstrap.TextContainer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link idm.bstrap.mm.bstrap.TextContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextContainerItemProvider extends TextPageContentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextContainerItemProvider(AdapterFactory adapterFactory) {
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

			addColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TextContainer_color_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TextContainer_color_feature",
								"_UI_TextContainer_type"),
						BstrapPackage.Literals.TEXT_CONTAINER__COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(BstrapPackage.Literals.TEXT_CONTAINER__TEXTELEMENTS);
			childrenFeatures.add(BstrapPackage.Literals.TEXT_CONTAINER__EMPHASIS);
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
	 * This returns TextContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextContainer"));
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
		Color labelValue = ((TextContainer) object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_TextContainer_type")
				: getString("_UI_TextContainer_type") + " " + label;
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

		switch (notification.getFeatureID(TextContainer.class)) {
		case BstrapPackage.TEXT_CONTAINER__COLOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case BstrapPackage.TEXT_CONTAINER__TEXTELEMENTS:
		case BstrapPackage.TEXT_CONTAINER__EMPHASIS:
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

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__TEXTELEMENTS,
				BstrapFactory.eINSTANCE.createText()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__TEXTELEMENTS,
				BstrapFactory.eINSTANCE.createCode()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__TEXTELEMENTS,
				BstrapFactory.eINSTANCE.createImage()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__TEXTELEMENTS,
				BstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__TEXTELEMENTS,
				BstrapFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__TEXTELEMENTS,
				BstrapFactory.eINSTANCE.createStrong()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__TEXTELEMENTS,
				BstrapFactory.eINSTANCE.createItalic()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__TEXTELEMENTS,
				BstrapFactory.eINSTANCE.createSpan()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__EMPHASIS,
				BstrapFactory.eINSTANCE.createItalicProperty()));

		newChildDescriptors.add(createChildParameter(BstrapPackage.Literals.TEXT_CONTAINER__EMPHASIS,
				BstrapFactory.eINSTANCE.createBold()));
	}

}
