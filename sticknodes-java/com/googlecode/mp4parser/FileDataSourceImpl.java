package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public class FileDataSourceImpl implements com.googlecode.mp4parser.DataSource {
    java.nio.channels.FileChannel fc;
    java.lang.String filename;

    public FileDataSourceImpl(java.io.File r2) throws java.io.FileNotFoundException {
            r1 = this;
            r1.<init>()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r1.fc = r0
            java.lang.String r2 = r2.getName()
            r1.filename = r2
            return
    }

    public FileDataSourceImpl(java.lang.String r2) throws java.io.FileNotFoundException {
            r1 = this;
            r1.<init>()
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            r1.fc = r2
            java.lang.String r2 = r0.getName()
            r1.filename = r2
            return
    }

    public FileDataSourceImpl(java.nio.channels.FileChannel r1) {
            r0 = this;
            r0.<init>()
            r0.fc = r1
            java.lang.String r1 = "unknown"
            r0.filename = r1
            return
    }

    public FileDataSourceImpl(java.nio.channels.FileChannel r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.fc = r1
            r0.filename = r2
            return
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.fc
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized java.nio.ByteBuffer map(long r7, long r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.nio.channels.FileChannel r0 = r6.fc     // Catch: java.lang.Throwable -> Ld
            java.nio.channels.FileChannel$MapMode r1 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> Ld
            r2 = r7
            r4 = r9
            java.nio.MappedByteBuffer r7 = r0.map(r1, r2, r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r6)
            return r7
        Ld:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized long position() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.fc     // Catch: java.lang.Throwable -> L9
            long r0 = r0.position()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized void position(long r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.FileChannel r0 = r1.fc     // Catch: java.lang.Throwable -> L8
            r0.position(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized int read(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.FileChannel r0 = r1.fc     // Catch: java.lang.Throwable -> L9
            int r2 = r0.read(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized long size() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.fc     // Catch: java.lang.Throwable -> L9
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.filename
            return r0
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized long transferTo(long r7, long r9, java.nio.channels.WritableByteChannel r11) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.nio.channels.FileChannel r0 = r6.fc     // Catch: java.lang.Throwable -> Lc
            r1 = r7
            r3 = r9
            r5 = r11
            long r7 = r0.transferTo(r1, r3, r5)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r6)
            return r7
        Lc:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }
}
