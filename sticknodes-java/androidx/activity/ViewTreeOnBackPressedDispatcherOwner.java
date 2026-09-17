package androidx.activity;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final void set(android.view.View r1, androidx.activity.OnBackPressedDispatcherOwner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onBackPressedDispatcherOwner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = androidx.activity.R$id.view_tree_on_back_pressed_dispatcher_owner
            r1.setTag(r0, r2)
            return
    }
}
