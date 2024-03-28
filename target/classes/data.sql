-- Insert sample hotels
INSERT INTO hotel (name) VALUES ('Hotel A');
INSERT INTO hotel (name) VALUES ('Hotel B');
INSERT INTO hotel (name) VALUES ('Hotel C');

-- Insert sample rooms
INSERT INTO room (number, type) VALUES ('101', 'Single');
INSERT INTO room (number, type) VALUES ('102', 'Double');
INSERT INTO room (number, type) VALUES ('103', 'Suite');

-- Insert sample bookings
INSERT INTO booking (customer_name, room_id) VALUES ('John Doe', 1);
INSERT INTO booking (customer_name, room_id) VALUES ('Jane Smith', 2);
INSERT INTO booking (customer_name, room_id) VALUES ('Alice Johnson', 3);
