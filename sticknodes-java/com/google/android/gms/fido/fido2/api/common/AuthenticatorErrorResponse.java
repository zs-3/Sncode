package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthenticatorErrorResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class AuthenticatorErrorResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorCodeAsInt", id = 2, type = "int")
    private final com.google.android.gms.fido.fido2.api.common.ErrorCode zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorMessage", id = 3)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "0", getter = "getInternalErrorCode", id = 4, type = "int")
    private final int zzc;

    static {
            com.google.android.gms.fido.fido2.api.common.zzl r0 = new com.google.android.gms.fido.fido2.api.common.zzl
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AuthenticatorErrorResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r3) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.ErrorCode r1 = com.google.android.gms.fido.fido2.api.common.ErrorCode.toErrorCode(r1)     // Catch: com.google.android.gms.fido.fido2.api.common.ErrorCode.UnsupportedErrorCodeException -> Le
            r0.zza = r1     // Catch: com.google.android.gms.fido.fido2.api.common.ErrorCode.UnsupportedErrorCodeException -> Le
            r0.zzb = r2
            r0.zzc = r3
            return
        Le:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse deserializeFromBytes(byte[] r1) {
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse> r0 = com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r1, r0)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r1 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) r1
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r4 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) r4
            com.google.android.gms.fido.fido2.api.common.ErrorCode r0 = r3.zza
            com.google.android.gms.fido.fido2.api.common.ErrorCode r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L30
            java.lang.String r0 = r3.zzb
            java.lang.String r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L30
            int r0 = r3.zzc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = r4.zzc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L30
            r4 = 1
            return r4
        L30:
            return r1
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public com.google.android.gms.fido.fido2.api.common.ErrorCode getErrorCode() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.ErrorCode r0 = r1.zza
            return r0
    }

    public int getErrorCodeAsInt() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.ErrorCode r0 = r1.zza
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
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.ErrorCode r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            int r1 = r3.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
            r1 = this;
            byte[] r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.fido.zzaj r0 = com.google.android.gms.internal.fido.zzak.zza(r3)
            com.google.android.gms.fido.fido2.api.common.ErrorCode r1 = r3.zza
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
            int r0 = r3.zzc
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
