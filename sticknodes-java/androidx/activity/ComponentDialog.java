package androidx.activity;

/* compiled from: ComponentDialog.kt */
/* loaded from: classes.dex */
public class ComponentDialog extends android.app.Dialog implements androidx.lifecycle.LifecycleOwner, androidx.activity.OnBackPressedDispatcherOwner {
    private androidx.lifecycle.LifecycleRegistry _lifecycleRegistry;
    private final androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher;

    public static /* synthetic */ void $r8$lambda$3VrmmHeIN9Sasz9FquQXdvV7x_o(androidx.activity.ComponentDialog r0) {
            m2onBackPressedDispatcher$lambda1(r0)
            return
    }

    public ComponentDialog(android.content.Context r2, int r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2, r3)
            androidx.activity.OnBackPressedDispatcher r2 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r3 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r3.<init>(r1)
            r2.<init>(r3)
            r1.onBackPressedDispatcher = r2
            return
    }

    private final androidx.lifecycle.LifecycleRegistry getLifecycleRegistry() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1._lifecycleRegistry
            if (r0 != 0) goto Lb
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1._lifecycleRegistry = r0
        Lb:
            return r0
    }

    private final void initViewTreeOwners() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r2)
            android.view.Window r0 = r2.getWindow()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window!!.decorView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(r0, r2)
            return
    }

    /* renamed from: onBackPressedDispatcher$lambda-1, reason: not valid java name */
    private static final void m2onBackPressedDispatcher$lambda1(androidx.activity.ComponentDialog r1) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            super.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.initViewTreeOwners()
            super.addContentView(r2, r3)
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.getLifecycleRegistry()
            return r0
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            return r0
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            r0.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            androidx.lifecycle.LifecycleRegistry r2 = r1.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r2.handleLifecycleEvent(r0)
            return
    }

    @Override // android.app.Dialog
    protected void onStart() {
            r2 = this;
            super.onStart()
            androidx.lifecycle.LifecycleRegistry r0 = r2.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // android.app.Dialog
    protected void onStop() {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2._lifecycleRegistry = r0
            super.onStop()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            r0.initViewTreeOwners()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.initViewTreeOwners()
            super.setContentView(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.initViewTreeOwners()
            super.setContentView(r2, r3)
            return
    }
}
