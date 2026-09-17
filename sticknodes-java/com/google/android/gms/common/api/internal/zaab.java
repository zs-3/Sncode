package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zaab implements com.google.android.gms.common.api.PendingResult.StatusListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaad zab;

    zaab(com.google.android.gms.common.api.internal.zaad r1, com.google.android.gms.common.api.internal.BasePendingResult r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaad r2 = r1.zab
            java.util.Map r2 = com.google.android.gms.common.api.internal.zaad.zaa(r2)
            com.google.android.gms.common.api.internal.BasePendingResult r0 = r1.zaa
            r2.remove(r0)
            return
    }
}
