package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AccountChangeEventsResponseCreator")
/* loaded from: classes.dex */
public class AccountChangeEventsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsResponse> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    final java.util.List zzb;

    static {
            com.google.android.gms.auth.zzc r0 = new com.google.android.gms.auth.zzc
            r0.<init>()
            com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AccountChangeEventsResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.List r1 = (java.util.List) r1
            r0.zzb = r1
            return
    }

    public AccountChangeEventsResponse(java.util.List<com.google.android.gms.auth.AccountChangeEvent> r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zza = r0
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.List r2 = (java.util.List) r2
            r1.zzb = r2
            return
    }

    public java.util.List<com.google.android.gms.auth.AccountChangeEvent> getEvents() {
            r1 = this;
            java.util.List r0 = r1.zzb
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.util.List r0 = r3.zzb
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
