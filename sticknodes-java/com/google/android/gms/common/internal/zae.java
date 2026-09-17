package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zae extends com.google.android.gms.common.internal.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ androidx.fragment.app.Fragment zab;
    final /* synthetic */ int zac;

    zae(android.content.Intent r1, androidx.fragment.app.Fragment r2, int r3) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
            r3 = this;
            android.content.Intent r0 = r3.zaa
            if (r0 == 0) goto Lb
            androidx.fragment.app.Fragment r1 = r3.zab
            int r2 = r3.zac
            r1.startActivityForResult(r0, r2)
        Lb:
            return
    }
}
