package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zad implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ android.widget.FrameLayout zaa;
    final /* synthetic */ android.view.LayoutInflater zab;
    final /* synthetic */ android.view.ViewGroup zac;
    final /* synthetic */ android.os.Bundle zad;
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zae;

    zad(com.google.android.gms.dynamic.DeferredLifecycleHelper r1, android.widget.FrameLayout r2, android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
            r0 = this;
            r0.zae = r1
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            r0.zad = r5
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate r4) {
            r3 = this;
            android.widget.FrameLayout r4 = r3.zaa
            r4.removeAllViews()
            com.google.android.gms.dynamic.DeferredLifecycleHelper r4 = r3.zae
            com.google.android.gms.dynamic.LifecycleDelegate r4 = com.google.android.gms.dynamic.DeferredLifecycleHelper.zaa(r4)
            android.view.LayoutInflater r0 = r3.zab
            android.view.ViewGroup r1 = r3.zac
            android.os.Bundle r2 = r3.zad
            android.view.View r4 = r4.onCreateView(r0, r1, r2)
            android.widget.FrameLayout r0 = r3.zaa
            r0.addView(r4)
            return
    }
}
