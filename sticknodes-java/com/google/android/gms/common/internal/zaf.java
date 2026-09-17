package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zaf extends com.google.android.gms.common.internal.zag {
    final /* synthetic */ android.content.Intent zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleFragment zab;

    zaf(android.content.Intent r1, com.google.android.gms.common.api.internal.LifecycleFragment r2, int r3) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
            r3 = this;
            android.content.Intent r0 = r3.zaa
            if (r0 == 0) goto La
            com.google.android.gms.common.api.internal.LifecycleFragment r1 = r3.zab
            r2 = 2
            r1.startActivityForResult(r0, r2)
        La:
            return
    }
}
