package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AccountChangeEventsRequestCreator")
/* loaded from: classes.dex */
public class AccountChangeEventsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsRequest> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    @java.lang.Deprecated
    java.lang.String zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    android.accounts.Account zzd;

    static {
            com.google.android.gms.auth.zzb r0 = new com.google.android.gms.auth.zzb
            r0.<init>()
            com.google.android.gms.auth.AccountChangeEventsRequest.CREATOR = r0
            return
    }

    public AccountChangeEventsRequest() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zza = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AccountChangeEventsRequest(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.accounts.Account r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            if (r4 != 0) goto L1b
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L1b
            android.accounts.Account r1 = new android.accounts.Account
            java.lang.String r2 = "com.google"
            r1.<init>(r3, r2)
            r0.zzd = r1
            return
        L1b:
            r0.zzd = r4
            return
    }

    public android.accounts.Account getAccount() {
            r1 = this;
            android.accounts.Account r0 = r1.zzd
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getAccountName() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public int getEventIndex() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setAccount(android.accounts.Account r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    @java.lang.Deprecated
    public com.google.android.gms.auth.AccountChangeEventsRequest setAccountName(java.lang.String r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setEventIndex(int r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zza
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            int r1 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            java.lang.String r1 = r4.zzc
            r2 = 3
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.accounts.Account r1 = r4.zzd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
