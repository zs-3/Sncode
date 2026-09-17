package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ConnectionResultCreator")
/* loaded from: classes.dex */
public final class ConnectionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.ConnectionResult> CREATOR = null;
    public static final int DEVELOPER_ERROR = 10;

    @java.lang.Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.ConnectionResult RESULT_SUCCESS = null;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int UNKNOWN = -1;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorCode", id = 2)
    private final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResolution", id = 3)
    private final android.app.PendingIntent zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getErrorMessage", id = 4)
    private final java.lang.String zzd;

    static {
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS = r0
            com.google.android.gms.common.zzb r0 = new com.google.android.gms.common.zzb
            r0.<init>()
            com.google.android.gms.common.ConnectionResult.CREATOR = r0
            return
    }

    public ConnectionResult(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ConnectionResult(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.app.PendingIntent r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public ConnectionResult(int r2, android.app.PendingIntent r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ConnectionResult(int r2, android.app.PendingIntent r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2, r3, r4)
            return
    }

    static java.lang.String zza(int r2) {
            r0 = 99
            if (r2 == r0) goto L76
            r0 = 1500(0x5dc, float:2.102E-42)
            if (r2 == r0) goto L73
            switch(r2) {
                case -1: goto L70;
                case 0: goto L6d;
                case 1: goto L6a;
                case 2: goto L67;
                case 3: goto L64;
                case 4: goto L61;
                case 5: goto L5e;
                case 6: goto L5b;
                case 7: goto L58;
                case 8: goto L55;
                case 9: goto L52;
                case 10: goto L4f;
                case 11: goto L4c;
                default: goto Lb;
            }
        Lb:
            switch(r2) {
                case 13: goto L49;
                case 14: goto L46;
                case 15: goto L43;
                case 16: goto L40;
                case 17: goto L3d;
                case 18: goto L3a;
                case 19: goto L37;
                case 20: goto L34;
                case 21: goto L31;
                case 22: goto L2e;
                case 23: goto L2b;
                case 24: goto L28;
                case 25: goto L25;
                default: goto Le;
            }
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UNKNOWN_ERROR_CODE("
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L25:
            java.lang.String r2 = "API_INSTALL_REQUIRED"
            return r2
        L28:
            java.lang.String r2 = "API_DISABLED_FOR_CONNECTION"
            return r2
        L2b:
            java.lang.String r2 = "API_DISABLED"
            return r2
        L2e:
            java.lang.String r2 = "RESOLUTION_ACTIVITY_NOT_FOUND"
            return r2
        L31:
            java.lang.String r2 = "API_VERSION_UPDATE_REQUIRED"
            return r2
        L34:
            java.lang.String r2 = "RESTRICTED_PROFILE"
            return r2
        L37:
            java.lang.String r2 = "SERVICE_MISSING_PERMISSION"
            return r2
        L3a:
            java.lang.String r2 = "SERVICE_UPDATING"
            return r2
        L3d:
            java.lang.String r2 = "SIGN_IN_FAILED"
            return r2
        L40:
            java.lang.String r2 = "API_UNAVAILABLE"
            return r2
        L43:
            java.lang.String r2 = "INTERRUPTED"
            return r2
        L46:
            java.lang.String r2 = "TIMEOUT"
            return r2
        L49:
            java.lang.String r2 = "CANCELED"
            return r2
        L4c:
            java.lang.String r2 = "LICENSE_CHECK_FAILED"
            return r2
        L4f:
            java.lang.String r2 = "DEVELOPER_ERROR"
            return r2
        L52:
            java.lang.String r2 = "SERVICE_INVALID"
            return r2
        L55:
            java.lang.String r2 = "INTERNAL_ERROR"
            return r2
        L58:
            java.lang.String r2 = "NETWORK_ERROR"
            return r2
        L5b:
            java.lang.String r2 = "RESOLUTION_REQUIRED"
            return r2
        L5e:
            java.lang.String r2 = "INVALID_ACCOUNT"
            return r2
        L61:
            java.lang.String r2 = "SIGN_IN_REQUIRED"
            return r2
        L64:
            java.lang.String r2 = "SERVICE_DISABLED"
            return r2
        L67:
            java.lang.String r2 = "SERVICE_VERSION_UPDATE_REQUIRED"
            return r2
        L6a:
            java.lang.String r2 = "SERVICE_MISSING"
            return r2
        L6d:
            java.lang.String r2 = "SUCCESS"
            return r2
        L70:
            java.lang.String r2 = "UNKNOWN"
            return r2
        L73:
            java.lang.String r2 = "DRIVE_EXTERNAL_STORAGE_REQUIRED"
            return r2
        L76:
            java.lang.String r2 = "UNFINISHED"
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.ConnectionResult
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            int r1 = r4.zzb
            int r3 = r5.zzb
            if (r1 != r3) goto L27
            android.app.PendingIntent r1 = r4.zzc
            android.app.PendingIntent r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L27
            java.lang.String r1 = r4.zzd
            java.lang.String r5 = r5.zzd
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r2
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public java.lang.String getErrorMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    public android.app.PendingIntent getResolution() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zzc
            return r0
    }

    public boolean hasResolution() {
            r1 = this;
            int r0 = r1.zzb
            if (r0 == 0) goto La
            android.app.PendingIntent r0 = r1.zzc
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            android.app.PendingIntent r1 = r3.zzc
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zzd
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            int r0 = r1.zzb
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void startResolutionForResult(android.app.Activity r9, int r10) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            boolean r0 = r8.hasResolution()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.PendingIntent r0 = r8.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.IntentSender r2 = r0.getIntentSender()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r9
            r3 = r10
            r1.startIntentSenderForResult(r2, r3, r4, r5, r6, r7)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            int r1 = r3.zzb
            java.lang.String r1 = zza(r1)
            java.lang.String r2 = "statusCode"
            r0.add(r2, r1)
            android.app.PendingIntent r1 = r3.zzc
            java.lang.String r2 = "resolution"
            r0.add(r2, r1)
            java.lang.String r1 = r3.zzd
            java.lang.String r2 = "message"
            r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            int r0 = r4.getErrorCode()
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            android.app.PendingIntent r0 = r4.getResolution()
            r2 = 3
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            java.lang.String r6 = r4.getErrorMessage()
            r0 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r0, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
