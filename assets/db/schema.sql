CREATE TABLE IF NOT EXISTS book (
    id INTEGER PRIMARY KEY,
    title_jp VARCHAR NOT NULL,
    title_cn VARCHAR NOT NULL,
    subtitle_jp VARCHAR,
    subtitle_cn VARCHAR,
    publisher VARCHAR,
    author VARCHAR,
    cover VARCHAR,
    description_jp VARCHAR,
    description_cn VARCHAR,
    is_learn BOOLEAN DEFAULT 0
);

CREATE TABLE IF NOT EXISTS chapter (
    id INTEGER PRIMARY KEY,
    book_id INTEGER NOT NULL,
    title_jp VARCHAR,
    title_cn VARCHAR,
    description_jp VARCHAR,
    description_cn VARCHAR,
    is_learn BOOLEAN DEFAULT 0
);

CREATE TABLE IF NOT EXISTS article (
    id INTEGER PRIMARY KEY,
    chapter_id INTEGER NOT NULL,
    title_jp VARCHAR,
    title_cn VARCHAR,
    content_jp VARCHAR,
    content_cn VARCHAR
);

CREATE TABLE IF NOT EXISTS sentence(
    id INTEGER PRIMARY KEY,
    chapter_id INTEGER NOT NULL,
    content_jp VARCHAR,
    content_cn VARCHAR
);

CREATE TABLE IF NOT EXISTS word (
    id INTEGER PRIMARY KEY,
    chapter_id INTEGER NOT NULL,
    hiragana VARCHAR,
    katakana VARCHAR,
    kannji VARCHAR,
    chinese VARCHAR
);