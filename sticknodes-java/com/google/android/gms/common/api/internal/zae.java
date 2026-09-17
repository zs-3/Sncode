package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zae extends com.google.android.gms.common.api.internal.zai {
    protected final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa;

    public zae(int r1, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "Null methods are not runnable."
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r1)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r1 = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) r1
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = r2.zaa     // Catch: java.lang.IllegalStateException -> L6
            r0.setFailedResult(r3)     // Catch: java.lang.IllegalStateException -> L6
            return
        L6:
            r3 = move-exception
            java.lang.String r0 = "ApiCallRunner"
            java.lang.String r1 = "Exception reporting failure"
            android.util.Log.w(r0, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception r4) {
            r3 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r4 = r4.getLocalizedMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ": "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1 = 10
            r0.<init>(r1, r4)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r4 = r3.zaa     // Catch: java.lang.IllegalStateException -> L2d
            r4.setFailedResult(r0)     // Catch: java.lang.IllegalStateException -> L2d
            return
        L2d:
            r4 = move-exception
            java.lang.String r0 = "ApiCallRunner"
            java.lang.String r1 = "Exception reporting failure"
            android.util.Log.w(r0, r1, r4)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq r2) throws android.os.DeadObjectException {
            r1 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = r1.zaa     // Catch: java.lang.RuntimeException -> La
            com.google.android.gms.common.api.Api$Client r2 = r2.zaf()     // Catch: java.lang.RuntimeException -> La
            r0.run(r2)     // Catch: java.lang.RuntimeException -> La
            return
        La:
            r2 = move-exception
            r1.zae(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(com.google.android.gms.common.api.internal.zaad r2, boolean r3) {
            r1 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r0 = r1.zaa
            r2.zac(r0, r3)
            return
    }
}
