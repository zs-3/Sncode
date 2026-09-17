package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zab extends com.google.android.gms.common.data.DataHolder.Builder {
    zab(java.lang.String[] r1, java.lang.String r2) {
            r0 = this;
            r2 = 0
            r0.<init>(r1, r2, r2)
            return
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final com.google.android.gms.common.data.DataHolder.Builder withRow(android.content.ContentValues r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Cannot add data to empty builder"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Cannot add data to empty builder"
            r2.<init>(r0)
            throw r2
    }
}
