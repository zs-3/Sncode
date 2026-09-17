package com.google.android.gms.drive.widget;

/* loaded from: classes.dex */
public class DataBufferAdapter<T> extends android.widget.BaseAdapter {
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = null;
    private final int fieldId;
    private final int resource;
    private final android.content.Context zzgw;
    private int zzmz;
    private final java.util.List<com.google.android.gms.common.data.DataBuffer<T>> zzna;
    private final android.view.LayoutInflater zznb;
    private boolean zznc;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "DataBufferAdapter"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.android.gms.drive.widget.DataBufferAdapter.zzbz = r0
            return
    }

    public DataBufferAdapter(android.content.Context r3, int r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2.<init>(r3, r4, r1, r0)
            return
    }

    public DataBufferAdapter(android.content.Context r2, int r3, int r4) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DataBufferAdapter(android.content.Context r2, int r3, int r4, java.util.List<com.google.android.gms.common.data.DataBuffer<T>> r5) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zznc = r0
            r1.zzgw = r2
            r1.zzmz = r3
            r1.resource = r3
            r1.fieldId = r4
            r1.zzna = r5
            java.lang.String r3 = "layout_inflater"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
            r1.zznb = r2
            return
    }

    public DataBufferAdapter(android.content.Context r1, int r2, int r3, com.google.android.gms.common.data.DataBuffer<T>... r4) {
            r0 = this;
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public DataBufferAdapter(android.content.Context r2, int r3, java.util.List<com.google.android.gms.common.data.DataBuffer<T>> r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public DataBufferAdapter(android.content.Context r2, int r3, com.google.android.gms.common.data.DataBuffer<T>... r4) {
            r1 = this;
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    private final android.view.View zza(int r2, android.view.View r3, android.view.ViewGroup r4, int r5) {
            r1 = this;
            if (r3 != 0) goto L9
            android.view.LayoutInflater r3 = r1.zznb
            r0 = 0
            android.view.View r3 = r3.inflate(r5, r4, r0)
        L9:
            int r4 = r1.fieldId     // Catch: java.lang.ClassCastException -> L2d
            if (r4 != 0) goto L11
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch: java.lang.ClassCastException -> L2d
            goto L17
        L11:
            android.view.View r4 = r3.findViewById(r4)     // Catch: java.lang.ClassCastException -> L2d
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch: java.lang.ClassCastException -> L2d
        L17:
            java.lang.Object r2 = r1.getItem(r2)
            boolean r5 = r2 instanceof java.lang.CharSequence
            if (r5 == 0) goto L25
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r4.setText(r2)
            goto L2c
        L25:
            java.lang.String r2 = r2.toString()
            r4.setText(r2)
        L2c:
            return r3
        L2d:
            r2 = move-exception
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.drive.widget.DataBufferAdapter.zzbz
            java.lang.String r4 = "DataBufferAdapter"
            java.lang.String r5 = "You must supply a resource ID for a TextView"
            r3.e(r4, r5, r2)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "DataBufferAdapter requires the resource ID to be a TextView"
            r3.<init>(r4, r2)
            throw r3
    }

    public void append(com.google.android.gms.common.data.DataBuffer<T> r2) {
            r1 = this;
            java.util.List<com.google.android.gms.common.data.DataBuffer<T>> r0 = r1.zzna
            r0.add(r2)
            boolean r2 = r1.zznc
            if (r2 == 0) goto Lc
            r1.notifyDataSetChanged()
        Lc:
            return
    }

    public void clear() {
            r2 = this;
            java.util.List<com.google.android.gms.common.data.DataBuffer<T>> r0 = r2.zzna
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.data.DataBuffer r1 = (com.google.android.gms.common.data.DataBuffer) r1
            r1.release()
            goto L6
        L16:
            java.util.List<com.google.android.gms.common.data.DataBuffer<T>> r0 = r2.zzna
            r0.clear()
            boolean r0 = r2.zznc
            if (r0 == 0) goto L22
            r2.notifyDataSetChanged()
        L22:
            return
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.zzgw
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r3 = this;
            java.util.List<com.google.android.gms.common.data.DataBuffer<T>> r0 = r3.zzna
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.data.DataBuffer r2 = (com.google.android.gms.common.data.DataBuffer) r2
            int r2 = r2.getCount()
            int r1 = r1 + r2
            goto L7
        L19:
            return r1
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            int r0 = r1.zzmz
            android.view.View r2 = r1.zza(r2, r3, r4, r0)
            return r2
    }

    @Override // android.widget.Adapter
    public T getItem(int r5) throws android.database.CursorIndexOutOfBoundsException {
            r4 = this;
            java.util.List<com.google.android.gms.common.data.DataBuffer<T>> r0 = r4.zzna
            java.util.Iterator r0 = r0.iterator()
            r1 = r5
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.data.DataBuffer r2 = (com.google.android.gms.common.data.DataBuffer) r2
            int r3 = r2.getCount()
            if (r3 > r1) goto L1b
            int r1 = r1 - r3
            goto L7
        L1b:
            java.lang.Object r5 = r2.get(r1)     // Catch: android.database.CursorIndexOutOfBoundsException -> L20
            return r5
        L20:
            android.database.CursorIndexOutOfBoundsException r0 = new android.database.CursorIndexOutOfBoundsException
            int r1 = r4.getCount()
            r0.<init>(r5, r1)
            throw r0
        L2a:
            android.database.CursorIndexOutOfBoundsException r0 = new android.database.CursorIndexOutOfBoundsException
            int r1 = r4.getCount()
            r0.<init>(r5, r1)
            throw r0
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            int r0 = r1.resource
            android.view.View r2 = r1.zza(r2, r3, r4, r0)
            return r2
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r1 = this;
            super.notifyDataSetChanged()
            r0 = 1
            r1.zznc = r0
            return
    }

    public void setDropDownViewResource(int r1) {
            r0 = this;
            r0.zzmz = r1
            return
    }

    public void setNotifyOnChange(boolean r1) {
            r0 = this;
            r0.zznc = r1
            return
    }
}
