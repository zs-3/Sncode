package androidx.core.view;

@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class ViewCompat {
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = null;
    private static final androidx.core.view.OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = null;
    private static boolean sAccessibilityDelegateCheckFailed;
    private static final androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = null;
    private static final java.util.concurrent.atomic.AtomicInteger sNextGeneratedId = null;
    private static java.util.WeakHashMap<android.view.View, java.lang.Object> sViewPropertyAnimatorMap;


    static class AccessibilityPaneVisibilityManager implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
        private final java.util.WeakHashMap<android.view.View, java.lang.Boolean> mPanesToVisible;

        AccessibilityPaneVisibilityManager() {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.mPanesToVisible = r0
                return
        }

        private void checkPaneVisibility(android.view.View r2, boolean r3) {
                r1 = this;
                boolean r0 = r2.isShown()
                if (r0 == 0) goto Le
                int r0 = r2.getWindowVisibility()
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r3 == r0) goto L24
                if (r0 == 0) goto L16
                r3 = 16
                goto L18
            L16:
                r3 = 32
            L18:
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(r2, r3)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r1.mPanesToVisible
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r3.put(r2, r0)
            L24:
                return
        }

        private void registerForLayoutCallback(android.view.View r1) {
                r0 = this;
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.addOnGlobalLayoutListener(r0)
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r3 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L30
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r3.mPanesToVisible
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                android.view.View r2 = (android.view.View) r2
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r3.checkPaneVisibility(r2, r1)
                goto L10
            L30:
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                r0.registerForLayoutCallback(r1)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }
    }

    static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final java.lang.Class<T> mType;

        AccessibilityViewProperty(int r1, java.lang.Class<T> r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.mTagKey = r1
                r0.mType = r2
                r0.mContentChangeType = r3
                r0.mFrameworkMinimumSdk = r4
                return
        }

        private boolean extrasAvailable() {
                r1 = this;
                r0 = 1
                return r0
        }

        private boolean frameworkAvailable() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r2.mFrameworkMinimumSdk
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        abstract T frameworkGet(android.view.View r1);

        T get(android.view.View r2) {
                r1 = this;
                boolean r0 = r1.frameworkAvailable()
                if (r0 == 0) goto Lb
                java.lang.Object r2 = r1.frameworkGet(r2)
                return r2
            Lb:
                boolean r0 = r1.extrasAvailable()
                if (r0 == 0) goto L20
                int r0 = r1.mTagKey
                java.lang.Object r2 = r2.getTag(r0)
                java.lang.Class<T> r0 = r1.mType
                boolean r0 = r0.isInstance(r2)
                if (r0 == 0) goto L20
                return r2
            L20:
                r2 = 0
                return r2
        }
    }

    static class Api16Impl {
        static android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r0) {
                android.view.accessibility.AccessibilityNodeProvider r0 = r0.getAccessibilityNodeProvider()
                return r0
        }

        static boolean getFitsSystemWindows(android.view.View r0) {
                boolean r0 = r0.getFitsSystemWindows()
                return r0
        }

        static int getImportantForAccessibility(android.view.View r0) {
                int r0 = r0.getImportantForAccessibility()
                return r0
        }

        static int getMinimumHeight(android.view.View r0) {
                int r0 = r0.getMinimumHeight()
                return r0
        }

        static int getMinimumWidth(android.view.View r0) {
                int r0 = r0.getMinimumWidth()
                return r0
        }

        static android.view.ViewParent getParentForAccessibility(android.view.View r0) {
                android.view.ViewParent r0 = r0.getParentForAccessibility()
                return r0
        }

        static int getWindowSystemUiVisibility(android.view.View r0) {
                int r0 = r0.getWindowSystemUiVisibility()
                return r0
        }

        static boolean hasOverlappingRendering(android.view.View r0) {
                boolean r0 = r0.hasOverlappingRendering()
                return r0
        }

        static boolean hasTransientState(android.view.View r0) {
                boolean r0 = r0.hasTransientState()
                return r0
        }

        static boolean performAccessibilityAction(android.view.View r0, int r1, android.os.Bundle r2) {
                boolean r0 = r0.performAccessibilityAction(r1, r2)
                return r0
        }

        static void postInvalidateOnAnimation(android.view.View r0) {
                r0.postInvalidateOnAnimation()
                return
        }

        static void postInvalidateOnAnimation(android.view.View r0, int r1, int r2, int r3, int r4) {
                r0.postInvalidateOnAnimation(r1, r2, r3, r4)
                return
        }

        static void postOnAnimation(android.view.View r0, java.lang.Runnable r1) {
                r0.postOnAnimation(r1)
                return
        }

        static void postOnAnimationDelayed(android.view.View r0, java.lang.Runnable r1, long r2) {
                r0.postOnAnimationDelayed(r1, r2)
                return
        }

        static void removeOnGlobalLayoutListener(android.view.ViewTreeObserver r0, android.view.ViewTreeObserver.OnGlobalLayoutListener r1) {
                r0.removeOnGlobalLayoutListener(r1)
                return
        }

        static void requestFitSystemWindows(android.view.View r0) {
                r0.requestFitSystemWindows()
                return
        }

        static void setBackground(android.view.View r0, android.graphics.drawable.Drawable r1) {
                r0.setBackground(r1)
                return
        }

        static void setHasTransientState(android.view.View r0, boolean r1) {
                r0.setHasTransientState(r1)
                return
        }

        static void setImportantForAccessibility(android.view.View r0, int r1) {
                r0.setImportantForAccessibility(r1)
                return
        }
    }

    static class Api19Impl {
        static int getAccessibilityLiveRegion(android.view.View r0) {
                int r0 = r0.getAccessibilityLiveRegion()
                return r0
        }

        static boolean isAttachedToWindow(android.view.View r0) {
                boolean r0 = r0.isAttachedToWindow()
                return r0
        }

        static boolean isLaidOut(android.view.View r0) {
                boolean r0 = r0.isLaidOut()
                return r0
        }

        static boolean isLayoutDirectionResolved(android.view.View r0) {
                boolean r0 = r0.isLayoutDirectionResolved()
                return r0
        }

        static void notifySubtreeAccessibilityStateChanged(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
                r0.notifySubtreeAccessibilityStateChanged(r1, r2, r3)
                return
        }

        static void setAccessibilityLiveRegion(android.view.View r0, int r1) {
                r0.setAccessibilityLiveRegion(r1)
                return
        }

        static void setContentChangeTypes(android.view.accessibility.AccessibilityEvent r0, int r1) {
                r0.setContentChangeTypes(r1)
                return
        }
    }

    static class Api20Impl {
        static android.view.WindowInsets dispatchApplyWindowInsets(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.dispatchApplyWindowInsets(r1)
                return r0
        }

        static android.view.WindowInsets onApplyWindowInsets(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.onApplyWindowInsets(r1)
                return r0
        }

        static void requestApplyInsets(android.view.View r0) {
                r0.requestApplyInsets()
                return
        }
    }

    private static class Api21Impl {


        static void callCompatInsetAnimationCallback(android.view.WindowInsets r1, android.view.View r2) {
                int r0 = androidx.core.R$id.tag_window_insets_animation_callback
                java.lang.Object r0 = r2.getTag(r0)
                android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
                if (r0 == 0) goto Ld
                r0.onApplyWindowInsets(r2, r1)
            Ld:
                return
        }

        static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(android.view.View r1, androidx.core.view.WindowInsetsCompat r2, android.graphics.Rect r3) {
                android.view.WindowInsets r0 = r2.toWindowInsets()
                if (r0 == 0) goto Lf
                android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r2, r1)
                return r1
            Lf:
                r3.setEmpty()
                return r2
        }

        static boolean dispatchNestedFling(android.view.View r0, float r1, float r2, boolean r3) {
                boolean r0 = r0.dispatchNestedFling(r1, r2, r3)
                return r0
        }

        static boolean dispatchNestedPreFling(android.view.View r0, float r1, float r2) {
                boolean r0 = r0.dispatchNestedPreFling(r1, r2)
                return r0
        }

        static boolean dispatchNestedPreScroll(android.view.View r0, int r1, int r2, int[] r3, int[] r4) {
                boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4)
                return r0
        }

        static boolean dispatchNestedScroll(android.view.View r0, int r1, int r2, int r3, int r4, int[] r5) {
                boolean r0 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
                return r0
        }

        static android.content.res.ColorStateList getBackgroundTintList(android.view.View r0) {
                android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
                return r0
        }

        static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getBackgroundTintMode()
                return r0
        }

        static float getElevation(android.view.View r0) {
                float r0 = r0.getElevation()
                return r0
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r0) {
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(r0)
                return r0
        }

        static java.lang.String getTransitionName(android.view.View r0) {
                java.lang.String r0 = r0.getTransitionName()
                return r0
        }

        static float getTranslationZ(android.view.View r0) {
                float r0 = r0.getTranslationZ()
                return r0
        }

        static float getZ(android.view.View r0) {
                float r0 = r0.getZ()
                return r0
        }

        static boolean hasNestedScrollingParent(android.view.View r0) {
                boolean r0 = r0.hasNestedScrollingParent()
                return r0
        }

        static boolean isImportantForAccessibility(android.view.View r0) {
                boolean r0 = r0.isImportantForAccessibility()
                return r0
        }

        static boolean isNestedScrollingEnabled(android.view.View r0) {
                boolean r0 = r0.isNestedScrollingEnabled()
                return r0
        }

        static void setBackgroundTintList(android.view.View r0, android.content.res.ColorStateList r1) {
                r0.setBackgroundTintList(r1)
                return
        }

        static void setBackgroundTintMode(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
                r0.setBackgroundTintMode(r1)
                return
        }

        static void setElevation(android.view.View r0, float r1) {
                r0.setElevation(r1)
                return
        }

        static void setNestedScrollingEnabled(android.view.View r0, boolean r1) {
                r0.setNestedScrollingEnabled(r1)
                return
        }

        static void setOnApplyWindowInsetsListener(android.view.View r2, androidx.core.view.OnApplyWindowInsetsListener r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 >= r1) goto Lb
                int r0 = androidx.core.R$id.tag_on_apply_window_listener
                r2.setTag(r0, r3)
            Lb:
                if (r3 != 0) goto L19
                int r3 = androidx.core.R$id.tag_window_insets_animation_callback
                java.lang.Object r3 = r2.getTag(r3)
                android.view.View$OnApplyWindowInsetsListener r3 = (android.view.View.OnApplyWindowInsetsListener) r3
                r2.setOnApplyWindowInsetsListener(r3)
                return
            L19:
                androidx.core.view.ViewCompat$Api21Impl$1 r0 = new androidx.core.view.ViewCompat$Api21Impl$1
                r0.<init>(r2, r3)
                r2.setOnApplyWindowInsetsListener(r0)
                return
        }

        static void setTransitionName(android.view.View r0, java.lang.String r1) {
                r0.setTransitionName(r1)
                return
        }

        static void setTranslationZ(android.view.View r0, float r1) {
                r0.setTranslationZ(r1)
                return
        }

        static void setZ(android.view.View r0, float r1) {
                r0.setZ(r1)
                return
        }

        static boolean startNestedScroll(android.view.View r0, int r1) {
                boolean r0 = r0.startNestedScroll(r1)
                return r0
        }

        static void stopNestedScroll(android.view.View r0) {
                r0.stopNestedScroll()
                return
        }
    }

    private static class Api23Impl {
        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r1) {
                android.view.WindowInsets r0 = r1.getRootWindowInsets()
                if (r0 != 0) goto L8
                r1 = 0
                return r1
            L8:
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                r0.setRootWindowInsets(r0)
                android.view.View r1 = r1.getRootView()
                r0.copyRootViewBounds(r1)
                return r0
        }

        static int getScrollIndicators(android.view.View r0) {
                int r0 = r0.getScrollIndicators()
                return r0
        }

        static void setScrollIndicators(android.view.View r0, int r1) {
                r0.setScrollIndicators(r1)
                return
        }

        static void setScrollIndicators(android.view.View r0, int r1, int r2) {
                r0.setScrollIndicators(r1, r2)
                return
        }
    }

    static class Api28Impl {
        static void addOnUnhandledKeyEventListener(android.view.View r2, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
                int r0 = androidx.core.R$id.tag_unhandled_key_listeners
                java.lang.Object r1 = r2.getTag(r0)
                androidx.collection.SimpleArrayMap r1 = (androidx.collection.SimpleArrayMap) r1
                if (r1 != 0) goto L12
                androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
                r1.<init>()
                r2.setTag(r0, r1)
            L12:
                java.util.Objects.requireNonNull(r3)
                androidx.core.view.ViewCompat$Api28Impl$$ExternalSyntheticLambda0 r0 = new androidx.core.view.ViewCompat$Api28Impl$$ExternalSyntheticLambda0
                r0.<init>(r3)
                r1.put(r3, r0)
                r2.addOnUnhandledKeyEventListener(r0)
                return
        }

        static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View r0) {
                java.lang.CharSequence r0 = r0.getAccessibilityPaneTitle()
                return r0
        }

        static boolean isAccessibilityHeading(android.view.View r0) {
                boolean r0 = r0.isAccessibilityHeading()
                return r0
        }

        static boolean isScreenReaderFocusable(android.view.View r0) {
                boolean r0 = r0.isScreenReaderFocusable()
                return r0
        }

        static void removeOnUnhandledKeyEventListener(android.view.View r1, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r2) {
                int r0 = androidx.core.R$id.tag_unhandled_key_listeners
                java.lang.Object r0 = r1.getTag(r0)
                androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                java.lang.Object r2 = r0.get(r2)
                android.view.View$OnUnhandledKeyEventListener r2 = (android.view.View.OnUnhandledKeyEventListener) r2
                if (r2 == 0) goto L16
                r1.removeOnUnhandledKeyEventListener(r2)
            L16:
                return
        }

        static <T> T requireViewById(android.view.View r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }

        static void setAccessibilityHeading(android.view.View r0, boolean r1) {
                r0.setAccessibilityHeading(r1)
                return
        }

        static void setAccessibilityPaneTitle(android.view.View r0, java.lang.CharSequence r1) {
                r0.setAccessibilityPaneTitle(r1)
                return
        }

        static void setScreenReaderFocusable(android.view.View r0, boolean r1) {
                r0.setScreenReaderFocusable(r1)
                return
        }
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(android.view.View r1, android.view.KeyEvent r2);
    }

    static class UnhandledKeyEventManager {
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> sViewsWithListeners = null;
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> mCapturedKeys;
        private java.lang.ref.WeakReference<android.view.KeyEvent> mLastDispatchedPreViewKeyEvent;
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> mViewsContainingListeners;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners = r0
                return
        }

        UnhandledKeyEventManager() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mViewsContainingListeners = r0
                r1.mCapturedKeys = r0
                r1.mLastDispatchedPreViewKeyEvent = r0
                return
        }

        static androidx.core.view.ViewCompat.UnhandledKeyEventManager at(android.view.View r2) {
                int r0 = androidx.core.R$id.tag_unhandled_key_event_manager
                java.lang.Object r1 = r2.getTag(r0)
                androidx.core.view.ViewCompat$UnhandledKeyEventManager r1 = (androidx.core.view.ViewCompat.UnhandledKeyEventManager) r1
                if (r1 != 0) goto L12
                androidx.core.view.ViewCompat$UnhandledKeyEventManager r1 = new androidx.core.view.ViewCompat$UnhandledKeyEventManager
                r1.<init>()
                r2.setTag(r0, r1)
            L12:
                return r1
        }

        private android.view.View dispatchInOrder(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r4.mViewsContainingListeners
                r1 = 0
                if (r0 == 0) goto L30
                boolean r0 = r0.containsKey(r5)
                if (r0 != 0) goto Lc
                goto L30
            Lc:
                boolean r0 = r5 instanceof android.view.ViewGroup
                if (r0 == 0) goto L29
                r0 = r5
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r2 = r0.getChildCount()
                int r2 = r2 + (-1)
            L19:
                if (r2 < 0) goto L29
                android.view.View r3 = r0.getChildAt(r2)
                android.view.View r3 = r4.dispatchInOrder(r3, r6)
                if (r3 == 0) goto L26
                return r3
            L26:
                int r2 = r2 + (-1)
                goto L19
            L29:
                boolean r6 = r4.onUnhandledKeyEvent(r5, r6)
                if (r6 == 0) goto L30
                return r5
            L30:
                return r1
        }

        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> getCapturedKeys() {
                r1 = this;
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                if (r0 != 0) goto Lb
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mCapturedKeys = r0
            Lb:
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                return r0
        }

        private boolean onUnhandledKeyEvent(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                int r0 = androidx.core.R$id.tag_unhandled_key_listeners
                java.lang.Object r0 = r5.getTag(r0)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                if (r0 == 0) goto L22
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            L10:
                if (r1 < 0) goto L22
                java.lang.Object r3 = r0.get(r1)
                androidx.core.view.ViewCompat$OnUnhandledKeyEventListenerCompat r3 = (androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat) r3
                boolean r3 = r3.onUnhandledKeyEvent(r5, r6)
                if (r3 == 0) goto L1f
                return r2
            L1f:
                int r1 = r1 + (-1)
                goto L10
            L22:
                r5 = 0
                return r5
        }

        private void recalcViewsWithUnhandled() {
                r6 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r6.mViewsContainingListeners
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L10
                return
            L10:
                monitor-enter(r0)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r1 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L5b
                if (r1 != 0) goto L1c
                java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L5b
                r1.<init>()     // Catch: java.lang.Throwable -> L5b
                r6.mViewsContainingListeners = r1     // Catch: java.lang.Throwable -> L5b
            L1c:
                int r1 = r0.size()     // Catch: java.lang.Throwable -> L5b
                int r1 = r1 + (-1)
            L22:
                if (r1 < 0) goto L59
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L5b
                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L5b
                android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L5b
                if (r3 != 0) goto L38
                r2.remove(r1)     // Catch: java.lang.Throwable -> L5b
                goto L56
            L38:
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r2 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L5b
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5b
                r2.put(r3, r4)     // Catch: java.lang.Throwable -> L5b
                android.view.ViewParent r2 = r3.getParent()     // Catch: java.lang.Throwable -> L5b
            L43:
                boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L5b
                if (r3 == 0) goto L56
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L5b
                r4 = r2
                android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L5b
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5b
                r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5b
                android.view.ViewParent r2 = r2.getParent()     // Catch: java.lang.Throwable -> L5b
                goto L43
            L56:
                int r1 = r1 + (-1)
                goto L22
            L59:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                return
            L5b:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                throw r1
        }

        boolean dispatch(android.view.View r3, android.view.KeyEvent r4) {
                r2 = this;
                int r0 = r4.getAction()
                if (r0 != 0) goto L9
                r2.recalcViewsWithUnhandled()
            L9:
                android.view.View r3 = r2.dispatchInOrder(r3, r4)
                int r0 = r4.getAction()
                if (r0 != 0) goto L2b
                int r4 = r4.getKeyCode()
                if (r3 == 0) goto L2b
                boolean r0 = android.view.KeyEvent.isModifierKey(r4)
                if (r0 != 0) goto L2b
                android.util.SparseArray r0 = r2.getCapturedKeys()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r3)
                r0.put(r4, r1)
            L2b:
                if (r3 == 0) goto L2f
                r3 = 1
                goto L30
            L2f:
                r3 = 0
            L30:
                return r3
        }

        boolean preDispatch(android.view.KeyEvent r6) {
                r5 = this;
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r5.mLastDispatchedPreViewKeyEvent
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto Lc
                return r1
            Lc:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.mLastDispatchedPreViewKeyEvent = r0
                r0 = 0
                android.util.SparseArray r2 = r5.getCapturedKeys()
                int r3 = r6.getAction()
                r4 = 1
                if (r3 != r4) goto L32
                int r3 = r6.getKeyCode()
                int r3 = r2.indexOfKey(r3)
                if (r3 < 0) goto L32
                java.lang.Object r0 = r2.valueAt(r3)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                r2.removeAt(r3)
            L32:
                if (r0 != 0) goto L3e
                int r0 = r6.getKeyCode()
                java.lang.Object r0 = r2.get(r0)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            L3e:
                if (r0 == 0) goto L52
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L51
                boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
                if (r1 == 0) goto L51
                r5.onUnhandledKeyEvent(r0, r6)
            L51:
                return r4
            L52:
                return r1
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            androidx.core.view.ViewCompat.sNextGeneratedId = r0
            r0 = 0
            androidx.core.view.ViewCompat.sViewPropertyAnimatorMap = r0
            r0 = 0
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r0
            r2 = 32
            int[] r2 = new int[r2]
            int r3 = androidx.core.R$id.accessibility_custom_action_0
            r2[r0] = r3
            int r0 = androidx.core.R$id.accessibility_custom_action_1
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_2
            r1 = 2
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_3
            r1 = 3
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_4
            r1 = 4
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_5
            r1 = 5
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_6
            r1 = 6
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_7
            r1 = 7
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_8
            r1 = 8
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_9
            r1 = 9
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_10
            r1 = 10
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_11
            r1 = 11
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_12
            r1 = 12
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_13
            r1 = 13
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_14
            r1 = 14
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_15
            r1 = 15
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_16
            r1 = 16
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_17
            r1 = 17
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_18
            r1 = 18
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_19
            r1 = 19
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_20
            r1 = 20
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_21
            r1 = 21
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_22
            r1 = 22
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_23
            r1 = 23
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_24
            r1 = 24
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_25
            r1 = 25
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_26
            r1 = 26
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_27
            r1 = 27
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_28
            r1 = 28
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_29
            r1 = 29
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_30
            r1 = 30
            r2[r1] = r0
            int r0 = androidx.core.R$id.accessibility_custom_action_31
            r1 = 31
            r2[r1] = r0
            androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS = r2
            androidx.core.view.ViewCompat$$ExternalSyntheticLambda0 r0 = androidx.core.view.ViewCompat$$ExternalSyntheticLambda0.INSTANCE
            androidx.core.view.ViewCompat.NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = r0
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r0 = new androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager
            r0.<init>()
            androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager = r0
            return
    }

    public static androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View r2, androidx.core.view.WindowInsetsCompat r3) {
            android.view.WindowInsets r0 = r3.toWindowInsets()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = androidx.core.view.ViewCompat.Api20Impl.dispatchApplyWindowInsets(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r2)
            return r2
        L15:
            return r3
    }

    static boolean dispatchUnhandledKeyEventBeforeCallback(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r2 = 0
            return r2
        L8:
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(r2)
            boolean r2 = r0.dispatch(r2, r3)
            return r2
    }

    static boolean dispatchUnhandledKeyEventBeforeHierarchy(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r2 = 0
            return r2
        L8:
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(r2)
            boolean r2 = r2.preDispatch(r3)
            return r2
    }

    public static int getAccessibilityLiveRegion(android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api19Impl.getAccessibilityLiveRegion(r0)
            return r0
    }

    public static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = paneTitleProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    public static int getImportantForAccessibility(android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api16Impl.getImportantForAccessibility(r0)
            return r0
    }

    public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.ViewCompat.Api23Impl.getRootWindowInsets(r2)
            return r2
        Lb:
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.ViewCompat.Api21Impl.getRootWindowInsets(r2)
            return r2
    }

    public static java.lang.String getTransitionName(android.view.View r0) {
            java.lang.String r0 = androidx.core.view.ViewCompat.Api21Impl.getTransitionName(r0)
            return r0
    }

    public static boolean isAttachedToWindow(android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api19Impl.isAttachedToWindow(r0)
            return r0
    }

    public static boolean isLaidOut(android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api19Impl.isLaidOut(r0)
            return r0
    }

    static void notifyViewAccessibilityStateChangedIfNeeded(android.view.View r4, int r5) {
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L13
            return
        L13:
            java.lang.CharSequence r1 = getAccessibilityPaneTitle(r4)
            if (r1 == 0) goto L27
            boolean r1 = r4.isShown()
            if (r1 == 0) goto L27
            int r1 = r4.getWindowVisibility()
            if (r1 != 0) goto L27
            r1 = 1
            goto L28
        L27:
            r1 = 0
        L28:
            int r2 = getAccessibilityLiveRegion(r4)
            r3 = 32
            if (r2 != 0) goto L89
            if (r1 == 0) goto L33
            goto L89
        L33:
            if (r5 != r3) goto L57
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r4.onInitializeAccessibilityEvent(r1)
            r1.setEventType(r3)
            androidx.core.view.ViewCompat.Api19Impl.setContentChangeTypes(r1, r5)
            r1.setSource(r4)
            r4.onPopulateAccessibilityEvent(r1)
            java.util.List r5 = r1.getText()
            java.lang.CharSequence r4 = getAccessibilityPaneTitle(r4)
            r5.add(r4)
            r0.sendAccessibilityEvent(r1)
            goto Lab
        L57:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto Lab
            android.view.ViewParent r0 = r4.getParent()
            androidx.core.view.ViewCompat.Api19Impl.notifySubtreeAccessibilityStateChanged(r0, r4, r4, r5)     // Catch: java.lang.AbstractMethodError -> L65
            goto Lab
        L65:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.view.ViewParent r4 = r4.getParent()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r0.append(r4)
            java.lang.String r4 = " does not fully implement ViewParent"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r4, r5)
            goto Lab
        L89:
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r1 == 0) goto L90
            goto L92
        L90:
            r3 = 2048(0x800, float:2.87E-42)
        L92:
            r0.setEventType(r3)
            androidx.core.view.ViewCompat.Api19Impl.setContentChangeTypes(r0, r5)
            if (r1 == 0) goto La8
            java.util.List r5 = r0.getText()
            java.lang.CharSequence r1 = getAccessibilityPaneTitle(r4)
            r5.add(r1)
            setViewImportanceForAccessibilityIfNeeded(r4)
        La8:
            r4.sendAccessibilityEventUnchecked(r0)
        Lab:
            return
    }

    public static androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r2, androidx.core.view.WindowInsetsCompat r3) {
            android.view.WindowInsets r0 = r3.toWindowInsets()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = androidx.core.view.ViewCompat.Api20Impl.onApplyWindowInsets(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r2)
            return r2
        L15:
            return r3
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> paneTitleProperty() {
            androidx.core.view.ViewCompat$2 r0 = new androidx.core.view.ViewCompat$2
            int r1 = androidx.core.R$id.tag_accessibility_pane_title
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r3 = 8
            r4 = 28
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static void requestApplyInsets(android.view.View r0) {
            androidx.core.view.ViewCompat.Api20Impl.requestApplyInsets(r0)
            return
    }

    public static void setImportantForAccessibility(android.view.View r0, int r1) {
            androidx.core.view.ViewCompat.Api16Impl.setImportantForAccessibility(r0, r1)
            return
    }

    public static void setTransitionName(android.view.View r0, java.lang.String r1) {
            androidx.core.view.ViewCompat.Api21Impl.setTransitionName(r0, r1)
            return
    }

    private static void setViewImportanceForAccessibilityIfNeeded(android.view.View r3) {
            int r0 = getImportantForAccessibility(r3)
            if (r0 != 0) goto La
            r0 = 1
            setImportantForAccessibility(r3, r0)
        La:
            android.view.ViewParent r0 = r3.getParent()
        Le:
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L26
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            int r1 = getImportantForAccessibility(r1)
            r2 = 4
            if (r1 != r2) goto L21
            r0 = 2
            setImportantForAccessibility(r3, r0)
            goto L26
        L21:
            android.view.ViewParent r0 = r0.getParent()
            goto Le
        L26:
            return
    }
}
