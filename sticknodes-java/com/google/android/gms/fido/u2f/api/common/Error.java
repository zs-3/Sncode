package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class Error {

    @com.google.android.gms.common.util.VisibleForTesting
    public static final java.lang.String JSON_ERROR_CODE = "errorCode";

    @com.google.android.gms.common.util.VisibleForTesting
    public static final java.lang.String JSON_ERROR_MESSAGE = "errorMessage";
    private final com.google.android.gms.fido.u2f.api.common.ErrorCode zza;
    private final java.lang.String zzb;

    public Error(com.google.android.gms.fido.u2f.api.common.ErrorCode r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    public Error(com.google.android.gms.fido.u2f.api.common.ErrorCode r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public com.google.android.gms.fido.u2f.api.common.ErrorCode getErrorCode() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.ErrorCode r0 = r1.zza
            return r0
    }

    public java.lang.String getErrorMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public org.json.JSONObject toJsonObject() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "errorCode"
            com.google.android.gms.fido.u2f.api.common.ErrorCode r2 = r3.zza     // Catch: org.json.JSONException -> L1a
            int r2 = r2.getCode()     // Catch: org.json.JSONException -> L1a
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L1a
            java.lang.String r1 = r3.zzb     // Catch: org.json.JSONException -> L1a
            if (r1 == 0) goto L19
            java.lang.String r2 = "errorMessage"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L1a
        L19:
            return r0
        L1a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.zzb
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1d
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.gms.fido.u2f.api.common.ErrorCode r3 = r5.zza
            int r3 = r3.getCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "{errorCode: %d}"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
        L1d:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.google.android.gms.fido.u2f.api.common.ErrorCode r4 = r5.zza
            int r4 = r4.getCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            java.lang.String r2 = r5.zzb
            r3[r1] = r2
            java.lang.String r1 = "{errorCode: %d, errorMessage: %s}"
            java.lang.String r0 = java.lang.String.format(r0, r1, r3)
            return r0
    }
}
