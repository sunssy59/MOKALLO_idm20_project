/**
 */
package idm.simpleusd.mm.usd.provider;

import idm.simpleusd.mm.usd.util.UsdAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UsdItemProviderAdapterFactory extends UsdAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsdItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Page} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageItemProvider pageItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPageAdapter() {
		if (pageItemProvider == null) {
			pageItemProvider = new PageItemProvider(this);
		}

		return pageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Paragraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphItemProvider paragraphItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParagraphAdapter() {
		if (paragraphItemProvider == null) {
			paragraphItemProvider = new ParagraphItemProvider(this);
		}

		return paragraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Title} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitleItemProvider titleItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Title}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTitleAdapter() {
		if (titleItemProvider == null) {
			titleItemProvider = new TitleItemProvider(this);
		}

		return titleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Code} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeItemProvider codeItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeAdapter() {
		if (codeItemProvider == null) {
			codeItemProvider = new CodeItemProvider(this);
		}

		return codeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.StrongEmphasis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrongEmphasisItemProvider strongEmphasisItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.StrongEmphasis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStrongEmphasisAdapter() {
		if (strongEmphasisItemProvider == null) {
			strongEmphasisItemProvider = new StrongEmphasisItemProvider(this);
		}

		return strongEmphasisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.ItalicEmphasis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItalicEmphasisItemProvider italicEmphasisItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.ItalicEmphasis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItalicEmphasisAdapter() {
		if (italicEmphasisItemProvider == null) {
			italicEmphasisItemProvider = new ItalicEmphasisItemProvider(this);
		}

		return italicEmphasisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.ListItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemItemProvider listItemItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListItemAdapter() {
		if (listItemItemProvider == null) {
			listItemItemProvider = new ListItemItemProvider(this);
		}

		return listItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.OrderedList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedListItemProvider orderedListItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.OrderedList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderedListAdapter() {
		if (orderedListItemProvider == null) {
			orderedListItemProvider = new OrderedListItemProvider(this);
		}

		return orderedListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.UnorderedList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnorderedListItemProvider unorderedListItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.UnorderedList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnorderedListAdapter() {
		if (unorderedListItemProvider == null) {
			unorderedListItemProvider = new UnorderedListItemProvider(this);
		}

		return unorderedListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.BlockQuote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockQuoteItemProvider blockQuoteItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.BlockQuote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockQuoteAdapter() {
		if (blockQuoteItemProvider == null) {
			blockQuoteItemProvider = new BlockQuoteItemProvider(this);
		}

		return blockQuoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.CodeBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBlockItemProvider codeBlockItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.CodeBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeBlockAdapter() {
		if (codeBlockItemProvider == null) {
			codeBlockItemProvider = new CodeBlockItemProvider(this);
		}

		return codeBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.CodeLine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeLineItemProvider codeLineItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeLineAdapter() {
		if (codeLineItemProvider == null) {
			codeLineItemProvider = new CodeLineItemProvider(this);
		}

		return codeLineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.HorizontalLine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HorizontalLineItemProvider horizontalLineItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.HorizontalLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHorizontalLineAdapter() {
		if (horizontalLineItemProvider == null) {
			horizontalLineItemProvider = new HorizontalLineItemProvider(this);
		}

		return horizontalLineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Table} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableItemProvider tableItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableAdapter() {
		if (tableItemProvider == null) {
			tableItemProvider = new TableItemProvider(this);
		}

		return tableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.TableBody} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableBodyItemProvider tableBodyItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.TableBody}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableBodyAdapter() {
		if (tableBodyItemProvider == null) {
			tableBodyItemProvider = new TableBodyItemProvider(this);
		}

		return tableBodyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.TableSeparator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableSeparatorItemProvider tableSeparatorItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.TableSeparator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableSeparatorAdapter() {
		if (tableSeparatorItemProvider == null) {
			tableSeparatorItemProvider = new TableSeparatorItemProvider(this);
		}

		return tableSeparatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.TableHead} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableHeadItemProvider tableHeadItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.TableHead}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableHeadAdapter() {
		if (tableHeadItemProvider == null) {
			tableHeadItemProvider = new TableHeadItemProvider(this);
		}

		return tableHeadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.TableRow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableRowItemProvider tableRowItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.TableRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableRowAdapter() {
		if (tableRowItemProvider == null) {
			tableRowItemProvider = new TableRowItemProvider(this);
		}

		return tableRowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.TableCell} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCellItemProvider tableCellItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.TableCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableCellAdapter() {
		if (tableCellItemProvider == null) {
			tableCellItemProvider = new TableCellItemProvider(this);
		}

		return tableCellItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Button} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonItemProvider buttonItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonAdapter() {
		if (buttonItemProvider == null) {
			buttonItemProvider = new ButtonItemProvider(this);
		}

		return buttonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Navigation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationItemProvider navigationItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Navigation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNavigationAdapter() {
		if (navigationItemProvider == null) {
			navigationItemProvider = new NavigationItemProvider(this);
		}

		return navigationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link idm.simpleusd.mm.usd.Section} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionItemProvider sectionItemProvider;

	/**
	 * This creates an adapter for a {@link idm.simpleusd.mm.usd.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSectionAdapter() {
		if (sectionItemProvider == null) {
			sectionItemProvider = new SectionItemProvider(this);
		}

		return sectionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (pageItemProvider != null)
			pageItemProvider.dispose();
		if (paragraphItemProvider != null)
			paragraphItemProvider.dispose();
		if (titleItemProvider != null)
			titleItemProvider.dispose();
		if (textItemProvider != null)
			textItemProvider.dispose();
		if (linkItemProvider != null)
			linkItemProvider.dispose();
		if (imageItemProvider != null)
			imageItemProvider.dispose();
		if (codeItemProvider != null)
			codeItemProvider.dispose();
		if (strongEmphasisItemProvider != null)
			strongEmphasisItemProvider.dispose();
		if (italicEmphasisItemProvider != null)
			italicEmphasisItemProvider.dispose();
		if (listItemItemProvider != null)
			listItemItemProvider.dispose();
		if (orderedListItemProvider != null)
			orderedListItemProvider.dispose();
		if (unorderedListItemProvider != null)
			unorderedListItemProvider.dispose();
		if (blockQuoteItemProvider != null)
			blockQuoteItemProvider.dispose();
		if (codeBlockItemProvider != null)
			codeBlockItemProvider.dispose();
		if (codeLineItemProvider != null)
			codeLineItemProvider.dispose();
		if (horizontalLineItemProvider != null)
			horizontalLineItemProvider.dispose();
		if (tableItemProvider != null)
			tableItemProvider.dispose();
		if (tableBodyItemProvider != null)
			tableBodyItemProvider.dispose();
		if (tableSeparatorItemProvider != null)
			tableSeparatorItemProvider.dispose();
		if (tableHeadItemProvider != null)
			tableHeadItemProvider.dispose();
		if (tableRowItemProvider != null)
			tableRowItemProvider.dispose();
		if (tableCellItemProvider != null)
			tableCellItemProvider.dispose();
		if (buttonItemProvider != null)
			buttonItemProvider.dispose();
		if (navigationItemProvider != null)
			navigationItemProvider.dispose();
		if (sectionItemProvider != null)
			sectionItemProvider.dispose();
	}

}
