CREATE TABLE CLICK_EVENT_STATISTICS
(
    id          SERIAL PRIMARY KEY,
    windowStart TIMESTAMP,
    windowEnd   TIMESTAMP,
    page        VARCHAR,
    count       DECIMAL
)