package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ErrorResponseDataCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
@java.lang.Deprecated
/* loaded from: classes.dex */
public class ErrorResponseData extends com.google.android.gms.fido.u2f.api.common.ResponseData {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ErrorResponseData> CREATOR = null;

    @com.google.android.gms.common.util.VisibleForTesting
    public static final java.lang.String JSON_ERROR_CODE = "errorCode";

    @com.google.android.gms.common.util.VisibleForTesting
    public static final java.lang.String JSON_ERROR_MESSAGE = "errorMessage";

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorCodeAsInt", id = 2, type = "int")
    private final com.google.android.gms.fido.u2f.api.common.ErrorCode zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorMessage", id = 3)
    private final java.lang.String zzb;

    static {
            com.google.android.gms.fido.u2f.api.common.zzd r0 = new com.google.android.gms.fido.u2f.api.common.zzd
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.ErrorResponseData.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ErrorResponseData(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.ErrorCode r1 = com.google.android.gms.fido.u2f.api.common.ErrorCode.toErrorCode(r1)
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public ErrorResponseData(com.google.android.gms.fido.u2f.api.common.ErrorCode r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.u2f.api.common.ErrorCode r1 = (com.google.android.gms.fido.u2f.api.common.ErrorCode) r1
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    public ErrorResponseData(com.google.android.gms.fido.u2f.api.common.ErrorCode r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.u2f.api.common.ErrorCode r1 = (com.google.android.gms.fido.u2f.api.common.ErrorCode) r1
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.u2f.api.common.ErrorResponseData
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.u2f.api.common.ErrorResponseData r4 = (com.google.android.gms.fido.u2f.api.common.ErrorResponseData) r4
            com.google.android.gms.fido.u2f.api.common.ErrorCode r0 = r3.zza
            com.google.android.gms.fido.u2f.api.common.ErrorCode r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L1e
            java.lang.String r0 = r3.zzb
            java.lang.String r4 = r4.zzb
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public com.google.android.gms.fido.u2f.api.common.ErrorCode getErrorCode() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.ErrorCode r0 = r1.zza
            return r0
    }

    public int getErrorCodeAsInt() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.ErrorCode r0 = r1.zza
            int r0 = r0.getCode()
            return r0
    }

    public java.lang.String getErrorMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.u2f.api.common.ErrorCode r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public final org.json.JSONObject toJsonObject() {
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
            r3 = this;
            com.google.android.gms.internal.fido.zzaj r0 = com.google.android.gms.internal.fido.zzak.zza(r3)
            com.google.android.gms.fido.u2f.api.common.ErrorCode r1 = r3.zza
            int r1 = r1.getCode()
            java.lang.String r2 = "errorCode"
            r0.zza(r2, r1)
            java.lang.String r1 = r3.zzb
            if (r1 == 0) goto L18
            java.lang.String r2 = "errorMessage"
            r0.zzb(r2, r1)
        L18:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.getErrorCodeAsInt()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.lang.String r0 = r3.getErrorMessage()
            r1 = 3
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
