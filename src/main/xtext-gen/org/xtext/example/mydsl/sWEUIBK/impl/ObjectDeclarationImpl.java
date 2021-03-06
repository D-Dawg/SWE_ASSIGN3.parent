/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.sWEUIBK.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.sWEUIBK.AnalyzerDeclaration;
import org.xtext.example.mydsl.sWEUIBK.ModelDeclaration;
import org.xtext.example.mydsl.sWEUIBK.MonitorDeclaration;
import org.xtext.example.mydsl.sWEUIBK.ObjectDeclaration;
import org.xtext.example.mydsl.sWEUIBK.PageDeclaration;
import org.xtext.example.mydsl.sWEUIBK.SWEUIBKPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sWEUIBK.impl.ObjectDeclarationImpl#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sWEUIBK.impl.ObjectDeclarationImpl#getAnalyzer <em>Analyzer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sWEUIBK.impl.ObjectDeclarationImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sWEUIBK.impl.ObjectDeclarationImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectDeclarationImpl extends MinimalEObjectImpl.Container implements ObjectDeclaration
{
  /**
   * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonitor()
   * @generated
   * @ordered
   */
  protected MonitorDeclaration monitor;

  /**
   * The cached value of the '{@link #getAnalyzer() <em>Analyzer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalyzer()
   * @generated
   * @ordered
   */
  protected AnalyzerDeclaration analyzer;

  /**
   * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPage()
   * @generated
   * @ordered
   */
  protected PageDeclaration page;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected ModelDeclaration model;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SWEUIBKPackage.Literals.OBJECT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonitorDeclaration getMonitor()
  {
    return monitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMonitor(MonitorDeclaration newMonitor, NotificationChain msgs)
  {
    MonitorDeclaration oldMonitor = monitor;
    monitor = newMonitor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.OBJECT_DECLARATION__MONITOR, oldMonitor, newMonitor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonitor(MonitorDeclaration newMonitor)
  {
    if (newMonitor != monitor)
    {
      NotificationChain msgs = null;
      if (monitor != null)
        msgs = ((InternalEObject)monitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SWEUIBKPackage.OBJECT_DECLARATION__MONITOR, null, msgs);
      if (newMonitor != null)
        msgs = ((InternalEObject)newMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SWEUIBKPackage.OBJECT_DECLARATION__MONITOR, null, msgs);
      msgs = basicSetMonitor(newMonitor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.OBJECT_DECLARATION__MONITOR, newMonitor, newMonitor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnalyzerDeclaration getAnalyzer()
  {
    return analyzer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnalyzer(AnalyzerDeclaration newAnalyzer, NotificationChain msgs)
  {
    AnalyzerDeclaration oldAnalyzer = analyzer;
    analyzer = newAnalyzer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.OBJECT_DECLARATION__ANALYZER, oldAnalyzer, newAnalyzer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnalyzer(AnalyzerDeclaration newAnalyzer)
  {
    if (newAnalyzer != analyzer)
    {
      NotificationChain msgs = null;
      if (analyzer != null)
        msgs = ((InternalEObject)analyzer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SWEUIBKPackage.OBJECT_DECLARATION__ANALYZER, null, msgs);
      if (newAnalyzer != null)
        msgs = ((InternalEObject)newAnalyzer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SWEUIBKPackage.OBJECT_DECLARATION__ANALYZER, null, msgs);
      msgs = basicSetAnalyzer(newAnalyzer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.OBJECT_DECLARATION__ANALYZER, newAnalyzer, newAnalyzer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageDeclaration getPage()
  {
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPage(PageDeclaration newPage, NotificationChain msgs)
  {
    PageDeclaration oldPage = page;
    page = newPage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.OBJECT_DECLARATION__PAGE, oldPage, newPage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPage(PageDeclaration newPage)
  {
    if (newPage != page)
    {
      NotificationChain msgs = null;
      if (page != null)
        msgs = ((InternalEObject)page).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SWEUIBKPackage.OBJECT_DECLARATION__PAGE, null, msgs);
      if (newPage != null)
        msgs = ((InternalEObject)newPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SWEUIBKPackage.OBJECT_DECLARATION__PAGE, null, msgs);
      msgs = basicSetPage(newPage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.OBJECT_DECLARATION__PAGE, newPage, newPage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDeclaration getModel()
  {
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModel(ModelDeclaration newModel, NotificationChain msgs)
  {
    ModelDeclaration oldModel = model;
    model = newModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.OBJECT_DECLARATION__MODEL, oldModel, newModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModel(ModelDeclaration newModel)
  {
    if (newModel != model)
    {
      NotificationChain msgs = null;
      if (model != null)
        msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SWEUIBKPackage.OBJECT_DECLARATION__MODEL, null, msgs);
      if (newModel != null)
        msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SWEUIBKPackage.OBJECT_DECLARATION__MODEL, null, msgs);
      msgs = basicSetModel(newModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SWEUIBKPackage.OBJECT_DECLARATION__MODEL, newModel, newModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SWEUIBKPackage.OBJECT_DECLARATION__MONITOR:
        return basicSetMonitor(null, msgs);
      case SWEUIBKPackage.OBJECT_DECLARATION__ANALYZER:
        return basicSetAnalyzer(null, msgs);
      case SWEUIBKPackage.OBJECT_DECLARATION__PAGE:
        return basicSetPage(null, msgs);
      case SWEUIBKPackage.OBJECT_DECLARATION__MODEL:
        return basicSetModel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SWEUIBKPackage.OBJECT_DECLARATION__MONITOR:
        return getMonitor();
      case SWEUIBKPackage.OBJECT_DECLARATION__ANALYZER:
        return getAnalyzer();
      case SWEUIBKPackage.OBJECT_DECLARATION__PAGE:
        return getPage();
      case SWEUIBKPackage.OBJECT_DECLARATION__MODEL:
        return getModel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SWEUIBKPackage.OBJECT_DECLARATION__MONITOR:
        setMonitor((MonitorDeclaration)newValue);
        return;
      case SWEUIBKPackage.OBJECT_DECLARATION__ANALYZER:
        setAnalyzer((AnalyzerDeclaration)newValue);
        return;
      case SWEUIBKPackage.OBJECT_DECLARATION__PAGE:
        setPage((PageDeclaration)newValue);
        return;
      case SWEUIBKPackage.OBJECT_DECLARATION__MODEL:
        setModel((ModelDeclaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SWEUIBKPackage.OBJECT_DECLARATION__MONITOR:
        setMonitor((MonitorDeclaration)null);
        return;
      case SWEUIBKPackage.OBJECT_DECLARATION__ANALYZER:
        setAnalyzer((AnalyzerDeclaration)null);
        return;
      case SWEUIBKPackage.OBJECT_DECLARATION__PAGE:
        setPage((PageDeclaration)null);
        return;
      case SWEUIBKPackage.OBJECT_DECLARATION__MODEL:
        setModel((ModelDeclaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SWEUIBKPackage.OBJECT_DECLARATION__MONITOR:
        return monitor != null;
      case SWEUIBKPackage.OBJECT_DECLARATION__ANALYZER:
        return analyzer != null;
      case SWEUIBKPackage.OBJECT_DECLARATION__PAGE:
        return page != null;
      case SWEUIBKPackage.OBJECT_DECLARATION__MODEL:
        return model != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectDeclarationImpl
