package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzr implements com.google.android.gms.appset.AppSetIdClient {
    private final com.google.android.gms.appset.AppSetIdClient zza;
    private final com.google.android.gms.appset.AppSetIdClient zzb;

    public zzr(android.content.Context r3) {
            r2 = this;
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            r2.<init>()
            com.google.android.gms.internal.appset.zzp r1 = new com.google.android.gms.internal.appset.zzp
            r1.<init>(r3, r0)
            r2.zza = r1
            com.google.android.gms.appset.AppSetIdClient r3 = com.google.android.gms.internal.appset.zzl.zzc(r3)
            r2.zzb = r3
            return
    }

    public static /* synthetic */ com.google.android.gms.tasks.Task zza(com.google.android.gms.internal.appset.zzr r2, com.google.android.gms.tasks.Task r3) {
            boolean r0 = r3.isSuccessful()
            if (r0 != 0) goto L57
            boolean r0 = r3.isCanceled()
            if (r0 == 0) goto Ld
            goto L57
        Ld:
            java.lang.Exception r0 = r3.getException()
            boolean r1 = r0 instanceof com.google.android.gms.common.api.ApiException
            if (r1 == 0) goto L57
            com.google.android.gms.common.api.ApiException r0 = (com.google.android.gms.common.api.ApiException) r0
            int r0 = r0.getStatusCode()
            r1 = 43001(0xa7f9, float:6.0257E-41)
            if (r0 == r1) goto L51
            r1 = 43002(0xa7fa, float:6.0259E-41)
            if (r0 == r1) goto L51
            r1 = 43003(0xa7fb, float:6.026E-41)
            if (r0 == r1) goto L51
            r1 = 17
            if (r0 != r1) goto L2f
            goto L51
        L2f:
            r2 = 43000(0xa7f8, float:6.0256E-41)
            if (r0 != r2) goto L40
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Failed to get app set ID due to an internal error. Please try again later."
            r2.<init>(r3)
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forException(r2)
            goto L57
        L40:
            r2 = 15
            if (r0 == r2) goto L45
            goto L57
        L45:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "The operation to get app set ID timed out. Please try again later."
            r2.<init>(r3)
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forException(r2)
            return r2
        L51:
            com.google.android.gms.appset.AppSetIdClient r2 = r2.zzb
            com.google.android.gms.tasks.Task r3 = r2.getAppSetIdInfo()
        L57:
            return r3
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> getAppSetIdInfo() {
            r2 = this;
            com.google.android.gms.appset.AppSetIdClient r0 = r2.zza
            com.google.android.gms.tasks.Task r0 = r0.getAppSetIdInfo()
            com.google.android.gms.internal.appset.zzq r1 = new com.google.android.gms.internal.appset.zzq
            r1.<init>(r2)
            com.google.android.gms.tasks.Task r0 = r0.continueWithTask(r1)
            return r0
    }
}
