package com.google.android.gms.common.internal.service;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zac extends com.google.android.gms.common.internal.service.zaf {
    zac(com.google.android.gms.common.internal.service.zae r1, com.google.android.gms.common.api.GoogleApiClient r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.common.internal.service.zah r2 = (com.google.android.gms.common.internal.service.zah) r2
            android.os.IInterface r2 = r2.getService()
            com.google.android.gms.common.internal.service.zal r2 = (com.google.android.gms.common.internal.service.zal) r2
            com.google.android.gms.common.internal.service.zad r0 = new com.google.android.gms.common.internal.service.zad
            r0.<init>(r1)
            r2.zae(r0)
            return
    }
}
