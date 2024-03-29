/**
 */
package idm.simpleusd.mm.usd.impl;

import idm.simpleusd.mm.usd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsdFactoryImpl extends EFactoryImpl implements UsdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsdFactory init() {
		try {
			UsdFactory theUsdFactory = (UsdFactory) EPackage.Registry.INSTANCE.getEFactory(UsdPackage.eNS_URI);
			if (theUsdFactory != null) {
				return theUsdFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UsdPackage.PAGE:
			return createPage();
		case UsdPackage.PARAGRAPH:
			return createParagraph();
		case UsdPackage.TITLE:
			return createTitle();
		case UsdPackage.TEXT:
			return createText();
		case UsdPackage.LINK:
			return createLink();
		case UsdPackage.IMAGE:
			return createImage();
		case UsdPackage.CODE:
			return createCode();
		case UsdPackage.STRONG_EMPHASIS:
			return createStrongEmphasis();
		case UsdPackage.ITALIC_EMPHASIS:
			return createItalicEmphasis();
		case UsdPackage.LIST_ITEM:
			return createListItem();
		case UsdPackage.ORDERED_LIST:
			return createOrderedList();
		case UsdPackage.UNORDERED_LIST:
			return createUnorderedList();
		case UsdPackage.BLOCK_QUOTE:
			return createBlockQuote();
		case UsdPackage.CODE_BLOCK:
			return createCodeBlock();
		case UsdPackage.CODE_LINE:
			return createCodeLine();
		case UsdPackage.HORIZONTAL_LINE:
			return createHorizontalLine();
		case UsdPackage.BUTTON:
			return createButton();
		case UsdPackage.NAVIGATION:
			return createNavigation();
		case UsdPackage.SECTION:
			return createSection();
		case UsdPackage.TABLE:
			return createTable();
		case UsdPackage.TABLE_BODY:
			return createTableBody();
		case UsdPackage.TABLE_HEAD:
			return createTableHead();
		case UsdPackage.TABLE_SEPARATOR:
			return createTableSeparator();
		case UsdPackage.TABLE_ROW:
			return createTableRow();
		case UsdPackage.TABLE_CELL:
			return createTableCell();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case UsdPackage.TABLE_CELL_ALIGNEMENT:
			return createTableCellAlignementFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case UsdPackage.TABLE_CELL_ALIGNEMENT:
			return convertTableCellAlignementToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrongEmphasis createStrongEmphasis() {
		StrongEmphasisImpl strongEmphasis = new StrongEmphasisImpl();
		return strongEmphasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItalicEmphasis createItalicEmphasis() {
		ItalicEmphasisImpl italicEmphasis = new ItalicEmphasisImpl();
		return italicEmphasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItem createListItem() {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedList createOrderedList() {
		OrderedListImpl orderedList = new OrderedListImpl();
		return orderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnorderedList createUnorderedList() {
		UnorderedListImpl unorderedList = new UnorderedListImpl();
		return unorderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockQuote createBlockQuote() {
		BlockQuoteImpl blockQuote = new BlockQuoteImpl();
		return blockQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock createCodeBlock() {
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLine createCodeLine() {
		CodeLineImpl codeLine = new CodeLineImpl();
		return codeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalLine createHorizontalLine() {
		HorizontalLineImpl horizontalLine = new HorizontalLineImpl();
		return horizontalLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navigation createNavigation() {
		NavigationImpl navigation = new NavigationImpl();
		return navigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableBody createTableBody() {
		TableBodyImpl tableBody = new TableBodyImpl();
		return tableBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableHead createTableHead() {
		TableHeadImpl tableHead = new TableHeadImpl();
		return tableHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableSeparator createTableSeparator() {
		TableSeparatorImpl tableSeparator = new TableSeparatorImpl();
		return tableSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCell createTableCell() {
		TableCellImpl tableCell = new TableCellImpl();
		return tableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCellAlignement createTableCellAlignementFromString(EDataType eDataType, String initialValue) {
		TableCellAlignement result = TableCellAlignement.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableCellAlignementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsdPackage getUsdPackage() {
		return (UsdPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsdPackage getPackage() {
		return UsdPackage.eINSTANCE;
	}

} //UsdFactoryImpl
